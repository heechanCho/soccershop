package com.soccerSite.soccershop.entity;

import com.soccerSite.soccershop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 상품 코드
    private Long id;

    @Column(nullable = false, length = 50)
    // 상품명
    private String itemNm;

    @Column(name = "price", nullable = false)
    // 가격
    private int price;

    @Column(nullable = false)
    // 재고수량
    private int stockNumber;

    @Lob
    @Column(nullable = false)
    // 상품 상세 설명
    private String itemDetail;

    @Enumerated(EnumType.STRING)
    // 상품 판매 상태
    private ItemSellStatus itemSellStatus;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;

}
