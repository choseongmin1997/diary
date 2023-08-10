package com.seongmin.diary.Service;

import com.seongmin.diary.persistence.domain.Shelf;
import com.seongmin.diary.persistence.repository.ShelfRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfService {

    private final ShelfRepository shelfRepository;

    public ShelfService(ShelfRepository shelfRepository) {
        this.shelfRepository = shelfRepository;
    }

    public List<Shelf> getShelves() {

        List<Shelf> shelfList = shelfRepository.findAll();
        if (shelfList.isEmpty()) {
            throw new RuntimeException("shelf not found");
        }

        return shelfList;
    }
}
