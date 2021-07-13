package com.palette.palette;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IColourRepository extends JpaRepository<Colour, String> {
}
