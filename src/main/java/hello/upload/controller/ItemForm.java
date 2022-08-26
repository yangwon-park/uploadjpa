package hello.upload.controller;

import hello.upload.domain.Item;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private List<MultipartFile> imageFiles;

    @Builder
    public ItemForm(Long itemId, String itemName, List<MultipartFile> imageFiles) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.imageFiles = imageFiles;
    }

}
