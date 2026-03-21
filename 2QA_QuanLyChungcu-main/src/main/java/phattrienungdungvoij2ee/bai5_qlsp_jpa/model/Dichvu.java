package phattrienungdungvoij2ee.bai5_qlsp_jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity
@Table(name = "dichvu")
public class Dichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Tên dịch vụ không được để trống")
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category_Dichvu category;
    @NotBlank(message = "Loại chi phí không được để trống")
    @Column(name = "cost_type")
    private String costType;
    @NotNull
    @DecimalMin(value = "0.0")
    @Column(name = "cost_value", precision = 15, scale = 2)
    private BigDecimal costValue;
    @NotBlank(message = "Đơn vị không được để trống")
    private String unit;
    @NotBlank(message = "Nhà cung cấp không được để trống")
    private String provider;
    @Column(columnDefinition = "TEXT")
    private String description;
}