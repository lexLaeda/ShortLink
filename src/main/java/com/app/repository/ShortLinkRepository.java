package com.app.repository;

import com.app.model.ShortLink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShortLinkRepository extends JpaRepository<ShortLink, Long> {
    Optional<ShortLink> findByLink(String link);

    Optional<ShortLink> findByOriginal(String original);

    List<ShortLink> findByOrderByCountDesc();
}
