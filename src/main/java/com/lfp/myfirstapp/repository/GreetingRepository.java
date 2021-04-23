package com.lfp.myfirstapp.repository;

import com.lfp.myfirstapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
