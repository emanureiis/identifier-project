package br.com.emanureiis.identifier.api.service;

import br.com.emanureiis.identifier.api.data.UnsettledTitleDTO;
import br.com.emanureiis.identifier.api.model.Title;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdentifierService {
    public static List titles = new ArrayList();

    public static List identify(UnsettledTitleDTO data, MultipartFile pdf) {
        Title title = new Title();
        titles.add(title);
        return titles;
    }
}
