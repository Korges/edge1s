package service;

import service.reader.ItemReader;
import service.strategy.Strategy;

import java.util.logging.Logger;

public class FacadeServiceImpl implements FacadeService {
    private final Logger log = Logger.getLogger(this.getClass().getName());
    private final ItemReader itemReader;
    private final Strategy strategy;

    public FacadeServiceImpl(ItemReader itemReader, Strategy strategy) {
        this.itemReader = itemReader;
        this.strategy = strategy;
    }

    public void result() {
        log.info("[FacadeServiceImpl] - Calculating result");
        Integer result = strategy.apply(itemReader.read());
    }
}