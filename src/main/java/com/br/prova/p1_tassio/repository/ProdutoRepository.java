package com.br.prova.p1_tassio.repository;

import com.br.prova.p1_tassio.model.Produto;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository implements JpaRepository<Produto, Long> {

    @Override
    public List<Produto> findAll() {
        return null;
    }

    @Override
    public List<Produto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Produto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Produto> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Produto entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Produto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Produto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Produto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Produto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Produto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Produto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Produto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Produto getOne(Long aLong) {
        return null;
    }

    @Override
    public Produto getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Produto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Produto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Produto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Produto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Produto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Produto> boolean exists(Example<S> example) {
        return false;
    }
}
