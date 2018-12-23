package org.happybean.pattern.mediator;

import java.util.Date;

/**
 * @author wgt
 * @date 2018-12-23
 * @description
 **/
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
