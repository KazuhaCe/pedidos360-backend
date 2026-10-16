package com.example.pedidos360_backend.repository;

import com.example.pedidos360_backend.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}