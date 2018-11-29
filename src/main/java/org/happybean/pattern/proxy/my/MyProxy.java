package org.happybean.pattern.proxy.my;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wgt
 * @date 2018-11-26
 * @description 自定义代理类（模拟jdk方式）
 * 思路：
 * 1.通过newProxyInstance返回代理对象
 * 2.声明一段源码（动态代理产生）
 * 3.编译源码（jdk compiler api），产生新的类（代理类）
 * 4.将此代理类load到内存中，产生一个新的对象（代理对象）
 * 5.return 代理对象
 **/
public class MyProxy {

    public static Object newProxyInstance(Class proxyClass, MyInvocationHandler invocationHandler) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String methodStr = "";

        for (Method method : proxyClass.getMethods()) {
            methodStr +=
                    "    @Override\n" +
                            "    public void " + method.getName() + "() {\n" +
                            "         try{\n" +
                            "             Method methodd = " + proxyClass.getName() + ".class.getMethod(\"" + method.getName() + "\");\n" +
                            "             handler.invoke(this,methodd);\n" +
                            "            }catch(Exception e){\n" +
                            "                              e.printStackTrace();\n" +
                            "            }\n" +
                            "      }\n";
        }

        String code = "package org.happybean.proxy.my;\n" +
                "import java.lang.reflect.Method;" +
                "" +
                "public class $Proxy0 implements " + proxyClass.getName() + " {\n" +
                "    private MyInvocationHandler handler;\n" +
                "\n" +
                "    public $Proxy0(MyInvocationHandler handler) {\n" +
                "        super();\n" +
                "        this.handler = handler;\n" +
                "    }" +
                "\n" +
                methodStr +
                "}";

        String fileName = System.getProperty("user.dir");
        fileName += "/src/main/java/org/happybean/proxy/my/$Proxy0.java";

        //生成java文件
        File file = new File(fileName);
        FileUtils.writeStringToFile(file, code);

        //编译
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        StandardJavaFileManager manager
                = compiler.getStandardFileManager(null, null, null);

        //获取文件
        Iterable units = manager.getJavaFileObjects(fileName);

        //编译任务
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, units);
        task.call();
        manager.close();

        //加载到内存
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        String classFile = "org.happybean.proxy.my.$Proxy0";
        Class clazz = loader.loadClass(classFile);

        Constructor constructor = clazz.getConstructor(MyInvocationHandler.class);

        return constructor.newInstance(invocationHandler);
    }
}
