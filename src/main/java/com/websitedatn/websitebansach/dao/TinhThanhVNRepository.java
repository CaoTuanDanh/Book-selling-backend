package com.websitedatn.websitebansach.dao;

import com.websitedatn.websitebansach.entity.TinhThanhVN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
public interface TinhThanhVNRepository extends JpaRepository<TinhThanhVN, Integer> {

}
