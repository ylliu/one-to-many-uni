package com.yllliu.demo;

import com.yllliu.entity.Course;
import com.yllliu.entity.Instructor;
import com.yllliu.entity.InstructorDetail;
import com.yllliu.entity.Review;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateCourseAndReviewDemo {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Course course1 = new Course("Course1");
        course1.addReview(new Review("Great!!"));
        course1.addReview(new Review("Well Done!!"));
        course1.addReview(new Review("Very Good!!"));

        entityManager.persist(course1);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
