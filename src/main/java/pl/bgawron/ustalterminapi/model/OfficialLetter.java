package pl.bgawron.ustalterminapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OfficialLetter {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String department;
    private String departmentCode;
    private String letterCode;
    private String queueNumber;

}
