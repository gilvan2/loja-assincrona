package com.loja_api.dto;

import com.loja_api.model.Shop;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class ShopDTO {

    private	String identifier;
    private LocalDate dateShop;
    private	String status;
    private List<ShopItemDTO> items = new ArrayList<>();

    public static ShopDTO convert(Shop shop) {
        ShopDTO shopDTO = new ShopDTO();
        shopDTO.setIdentifier(shop.getIdentifier());
        shopDTO.setStatus(shop.getStatus());
        shopDTO.setDateShop(shop.getDateShop());
        shopDTO.setItems(shop.getItems().stream().map(ShopItemDTO::convert).collect(Collectors.toList()));
        return shopDTO;
    }
}