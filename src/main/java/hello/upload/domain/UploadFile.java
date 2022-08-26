package hello.upload.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@ToString(of={"uploadFileName", "storeFileName"})
public class UploadFile {

    @Id @GeneratedValue
    @Column(name="uploadfile_id")
    private Long id;
    private String uploadFileName;
    private String storeFileName;  // 중복 방지를 위한 내부 관리 파일명

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Builder
    public UploadFile(String uploadFilename, String storeFileName) {
        this.uploadFileName = uploadFilename;
        this.storeFileName = storeFileName;
    }

    // 연관 관계 편의 메소드
    public void setItem(Item item) {
        this.item = item;
        item.getUploadFileList().add(this);
    }



}
