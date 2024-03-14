package com.example.shop.repository;

import com.example.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findItemByItemNm(String itemNm);

    List<Item> findItemByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findItemByPriceLessThan(Integer price);

    List<Item> findItemByPriceLessThanOrderByPriceDesc(Integer price);
}
