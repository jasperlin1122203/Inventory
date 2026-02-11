package com.inventory.service;

import com.inventory.model.OrderCSVRecord;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Slf4j
@Service
public class OrderCSVReader {

    /**
     * Read orders from CSV file
     */
    public List<OrderCSVRecord> readOrdersFromCSV(String csvFilePath) {
        // TODO: Read orders from CSV file
        // 1. Load CSV file as ClassPathResource
        // 2. Check if file exists, throw exception if not
        // 3. Use OpenCSV CsvToBeanBuilder to parse CSV to OrderCSVRecord list
        // 4. Return parsed records
        // 5. Handle exceptions appropriately
        throw new UnsupportedOperationException("TODO: Implement readOrdersFromCSV");
    }
}
