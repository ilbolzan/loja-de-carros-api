package com.gx2.lojadecarrosapi.repository;

import com.gx2.lojadecarrosapi.entity.Veiculo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VeiculoRepository extends MongoRepository<Veiculo, String>{

}