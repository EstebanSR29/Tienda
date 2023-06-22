package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "techshop-3ee8e.appspot.com";
    
    final String rutaSuperiorStorage = "techshop";
    
    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "techshop-3ee8e-firebase-adminsdk-br5ty-edb013e1ad.json";
    
}
