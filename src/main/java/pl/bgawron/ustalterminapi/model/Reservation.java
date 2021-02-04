package pl.bgawron.ustalterminapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Long idSprawy;
    private String name;
    private String lastName;

    @Email
    private String email;
    private Date createData;
    private Date sprawyData;
    private String note;

    public Reservation() {
    }

    public Reservation(Long id, Long idSprawy, String name, String lastName, @Email String email, Date createData, Date sprawyData, String note) {
        this.id = id;
        this.idSprawy = idSprawy;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createData = createData;
        this.sprawyData = sprawyData;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSprawy() {
        return idSprawy;
    }

    public void setIdSprawy(Long idSprawy) {
        this.idSprawy = idSprawy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public Date getSprawyData() {
        return sprawyData;
    }

    public void setSprawyData(Date sprawyData) {
        this.sprawyData = sprawyData;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
