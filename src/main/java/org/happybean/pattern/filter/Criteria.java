package org.happybean.pattern.filter;

import java.util.List;

/**
 * @author wgt
 * @date 2018-12-04
 * @description
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
