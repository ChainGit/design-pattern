package com.chain.learn.design.pattern.criteria;

import com.chain.learn.design.pattern.common.utils.PrintUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 1:21 PM
 */

public class CriteriaPatternTest {

    @Test
    public void test() {
        List<Person> personList = new ArrayList<>();
        personList.add(Person.builder().id(1L).name("jack1").age(12).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(2L).name("jack2").age(22).gender(PersonConstants.FEMALE_GENDER).build());
        personList.add(Person.builder().id(3L).name("jack3").age(32).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(4L).name("jack4").age(13).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(5L).name("jack5").age(8).gender(PersonConstants.FEMALE_GENDER).build());
        personList.add(Person.builder().id(6L).name("jack6").age(56).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(7L).name("jack7").age(18).gender(PersonConstants.FEMALE_GENDER).build());
        personList.add(Person.builder().id(8L).name("jack8").age(19).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(9L).name("jack9").age(21).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(10L).name("jack10").age(24).gender(PersonConstants.FEMALE_GENDER).build());
        personList.add(Person.builder().id(11L).name("jack11").age(88).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(12L).name("jack12").age(1).gender(PersonConstants.MALE_GENDER).build());
        personList.add(Person.builder().id(13L).name("jack13").age(7).gender(PersonConstants.FEMALE_GENDER).build());

        Criteria<Person> adultCriteria = new AdultCriteria();
        Criteria<Person> childCriteria = new ChildCriteria();
        Criteria<Person> femaleCriteria = new FemaleCriteria();
        Criteria<Person> maleCriteria = new MaleCriteria();

        CriteriaProcessor<Person> criteriaProcessor = null;
        List<Person> resultPersonList = null;

        criteriaProcessor = PersonCriteriaProcessor.of(personList);
        resultPersonList = criteriaProcessor.result();

        PrintUtils.println(resultPersonList.size());
        PrintUtils.printPrettyJsonString(resultPersonList);

        criteriaProcessor = PersonCriteriaProcessor.of(personList).inter(adultCriteria).inter(femaleCriteria);
        resultPersonList = criteriaProcessor.result();

        PrintUtils.println(resultPersonList.size());
        PrintUtils.printPrettyJsonString(resultPersonList);

        criteriaProcessor = PersonCriteriaProcessor.of(personList).inter(childCriteria).inter(maleCriteria);
        resultPersonList = criteriaProcessor.result();

        PrintUtils.println(resultPersonList.size());
        PrintUtils.printPrettyJsonString(resultPersonList);

        criteriaProcessor = PersonCriteriaProcessor.of(personList).inter(childCriteria).union(maleCriteria);
        resultPersonList = criteriaProcessor.result();

        PrintUtils.println(resultPersonList.size());
        PrintUtils.printPrettyJsonString(resultPersonList);

        criteriaProcessor = PersonCriteriaProcessor.of(personList).inter(PersonCriteriaProcessor.of(personList));
        resultPersonList = criteriaProcessor.result();

        PrintUtils.println(resultPersonList.size());
        PrintUtils.printPrettyJsonString(resultPersonList);

        criteriaProcessor = PersonCriteriaProcessor.of(personList).union(PersonCriteriaProcessor.of(personList));
        resultPersonList = criteriaProcessor.result();

        PrintUtils.println(resultPersonList.size());
        PrintUtils.printPrettyJsonString(resultPersonList);
    }
}
