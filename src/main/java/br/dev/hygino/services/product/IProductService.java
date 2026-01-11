package br.dev.hygino.services.product;

import java.util.List;

import br.dev.hygino.dtos.MinProductResponseDto;
import br.dev.hygino.models.Product;

public interface IProductService {

    MinProductResponseDto addProduct(Product product);

    MinProductResponseDto getProductById(Long id);

    void deleteProductById(Long id);

    MinProductResponseDto updateProduct(Long productId, Product product);

    List<MinProductResponseDto> getAllProducts();

    List<MinProductResponseDto> getProductsByCategory(String category);

    List<MinProductResponseDto> getProductsByBrand(String brand);

    List<MinProductResponseDto> getProductsByCategoryAndBrand(String category, String brand);

    List<MinProductResponseDto> getProductsByName(String name);

    List<MinProductResponseDto> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
