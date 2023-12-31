package com.likelion.market.repository;

import com.likelion.market.entity.NegotiationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NegotiationRepository extends JpaRepository<NegotiationEntity, Long> {
    List<NegotiationEntity> findByItemId(Long itemId);
    List<NegotiationEntity> findAllByItemId(Long itemId);
    Page<NegotiationEntity> findAllByItemIdAndWriterAndPassword(Long itemId, String writer, String password, Pageable pageable);
    Page<NegotiationEntity> findAllByItemId(Long itemId, Pageable pageable);
}
