package com.greetingapp.Repository;

import com.greetingapp.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
