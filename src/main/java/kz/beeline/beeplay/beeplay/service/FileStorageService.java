package kz.beeline.beeplay.beeplay.service;

import org.springframework.core.io.Resource;

import java.io.File;
import java.net.MalformedURLException;

public interface FileStorageService {
    Resource loadFileAsResource(String fileName) throws MalformedURLException;
    String saveFileToDirectory(String path,File file);
}
