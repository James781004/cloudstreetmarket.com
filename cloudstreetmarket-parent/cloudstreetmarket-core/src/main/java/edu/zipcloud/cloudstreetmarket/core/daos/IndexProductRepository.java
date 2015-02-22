package edu.zipcloud.cloudstreetmarket.core.daos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.zipcloud.cloudstreetmarket.core.entities.Index;
import edu.zipcloud.cloudstreetmarket.core.entities.Market;
import edu.zipcloud.cloudstreetmarket.core.enums.MarketCode;

public interface IndexProductRepository{
	List<Index> findByMarket(Market market);
	Page<Index> findByMarket(Market market, Pageable pageable);
	List<Index> findAll();
	Page<Index> findAll(Pageable pageable);
	Index findByCode(MarketCode code);
}
