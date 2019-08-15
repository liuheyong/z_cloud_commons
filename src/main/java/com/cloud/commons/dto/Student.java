package com.cloud.commons.dto;

import java.io.Serializable;

/**
 * @author: LiuHeYong
 * @create: 2019-04-19
 * @exception:
 * @description:
 **/
public class Student implements Serializable {

    private static final long serialVersionUID = -46851638838601600L;

    private Integer id;

    private int age;

    private String name;

    private int score;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(Integer id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student(Integer id, int age, String name, int score) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }*/

}
