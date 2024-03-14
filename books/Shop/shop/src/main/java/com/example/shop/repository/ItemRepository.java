package com.example.shop.repository;

import com.example.shop.entity.Item;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {
    List<Item> findItemByItemNm(String itemNm);

    List<Item> findItemByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findItemByPriceLessThan(Integer price);

    List<Item> findItemByPriceLessThanOrderByPriceDesc(Integer price);

    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findItemByItemDetail(@Param("itemDetail") String itemDetail);

    @Query(value = "select * from item i where i.item_detail " +
            "       like %:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findItemByItemDetailByNative(@Param("itemDetail") String itemDetail);

}
