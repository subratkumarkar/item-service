package com.nextgen.item.controller;

import com.nextgen.item.dto.ItemResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/items")
@Slf4j
public class ItemController {
    /**
     * Retrieves a Item by its ID.
     * @param id The ID of the task to retrieve.
     * @return ResponseEntity containing the Taskx
     */
    @GetMapping("/{id}")
    public ResponseEntity<ItemResponse> getItemById(@PathVariable String id) {
        log.info("Getting item with id {}", id);
        ItemResponse itemResponse = new ItemResponse();
        itemResponse.setId(id);
        itemResponse.setName("Test Item");
        return ResponseEntity.ok(itemResponse);
    }



}
