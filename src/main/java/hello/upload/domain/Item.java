package hello.upload.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;
    private String itemName;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<UploadFile> uploadFileList = new ArrayList<>();

    @Builder
    public Item(String itemName, List<UploadFile> uploadFileList) {
        this.itemName = itemName;
        this.uploadFileList = uploadFileList;
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }

}
