package hello.upload.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
