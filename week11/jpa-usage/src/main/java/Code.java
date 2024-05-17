import jakarta.persistence.*;

@Entity
@Table(name = "codes")
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_id", columnDefinition = "serial")
    private int code_id;

    @Column(name = "code_group", nullable = false)
    private String group;
    @Column(name = "code_serial", nullable = false)
    private String serial;

    @OneToOne(mappedBy = "code")
    private Product product;
    public Code(){

    }

    public int getCode_id() {
        return code_id;
    }

    public void setCode_id(int code_id) {
        this.code_id = code_id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Code{" +
                "code_id=" + code_id +
                ", group='" + group + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
