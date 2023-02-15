package com.viavarejotest.viavarejotest.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long test_id;

    private String test_name;

    public Test(Long test_id, String test_name) {
        this.test_id = test_id;
        this.test_name = test_name;
    }

    public Test() {

    }

    public Long getTest_id() {
        return test_id;
    }

    public void setTest_id(Long test_id) {
        this.test_id = test_id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(test_id, test.test_id) && Objects.equals(test_name, test.test_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test_id, test_name);
    }

    @Override
    public String toString() {
        return "Test{" +
                "test_id=" + test_id +
                ", test_name='" + test_name + '\'' +
                '}';
    }
}
