package java15.metods;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(generator = "customer_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "customer_gen",sequenceName = "customer_seg", allocationSize = 1)

    private Long id ;
    private String first_Name;
    private String last_Name;
    private int phone_Number;

    public Customer(String first_Name, String last_Name, int phone_Number) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.phone_Number = phone_Number;
    }
}

