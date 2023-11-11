package pl.edu.ug.tent.springintro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.edu.ug.tent.springintro.domain.Person;

@Service
public class PersonService {

  @Autowired
  @Qualifier("prezes")
  Person prezes;
  @Autowired
  @Qualifier("wiceprezes")
  Person wice;
  @Autowired
  @Qualifier("sekretarka")
  Person sekretara;


  Person getPrezes(){
    return prezes;
  }
  Person getWice(){
    return wice;
  }
  Person getSekretarka(){
    return sekretara;
  }

}
