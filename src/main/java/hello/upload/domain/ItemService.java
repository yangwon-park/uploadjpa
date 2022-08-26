package hello.upload.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ItemService {

    private final ItemRepository itemRepository;


    @Transactional
    public Long save(Item item) {
        return itemRepository.save(item).getId();
    }

    public Item findById(Long itemId) {
        return itemRepository.findById(itemId).orElseThrow(IllegalArgumentException::new);
    }
}
