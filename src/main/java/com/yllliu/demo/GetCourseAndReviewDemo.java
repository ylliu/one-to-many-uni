package com.yllliu.demo;

import com.yllliu.entity.Course;
import com.yllliu.entity.Review;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCourseAndReviewDemo {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        int courseId = 10;

        Course course = entityManager.find(Course.class, courseId);

        System.out.println(course);

        System.out.println(course.getReviews());

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
