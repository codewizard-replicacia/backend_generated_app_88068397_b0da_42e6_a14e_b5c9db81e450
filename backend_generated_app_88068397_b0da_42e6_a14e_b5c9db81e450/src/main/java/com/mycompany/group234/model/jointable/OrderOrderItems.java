package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.ProductType;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.OrderItem;
import com.mycompany.group234.model.Order;
import com.mycompany.group234.model.Customer;

@Entity(name = "OrderOrderItems")
@Table(schema = "\"generated_app\"", name = "\"OrderOrderItems\"")
@Data
public class OrderOrderItems{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Order_Id\"")
	private Integer order_Id;

    
    @Column(name = "\"Item_Id\"")
    private Integer item_Id;
 
}