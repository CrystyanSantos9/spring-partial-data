package dev.cryss.repository;

import dev.cryss.partial_update.PartialUpdateApplication;
import dev.cryss.partial_update.repository.CustomerRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith (SpringRunner.class)
@DataJpaTest
@Log4j2
@ContextConfiguration(classes= PartialUpdateApplication.class)
public class RepositoryTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;


    @Test
    @Transactional
    public void save_whenPerson_Succesfully(){



    }
}
