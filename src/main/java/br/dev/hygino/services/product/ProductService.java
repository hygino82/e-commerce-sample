package br.dev.hygino.services.product;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.hygino.dtos.MinProductResponseDto;
import br.dev.hygino.exceptions.ProductNotFoundException;
import br.dev.hygino.mappers.ProductMapper;
import br.dev.hygino.models.Product;
import br.dev.hygino.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    @Transactional
    public MinProductResponseDto addProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Long countProductsByBrandAndName(String brand, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        () -> {
                            throw new ProductNotFoundException("Product not found!");
                        });
    }

    @Override
    @Transactional(readOnly = true)
    public List<MinProductResponseDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toMinProductResponseDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public MinProductResponseDto getProductById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toMinProductResponseDto)
                .orElseThrow(() -> new ProductNotFoundException("Product not found!"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<MinProductResponseDto> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand)
                .stream()
                .map(productMapper::toMinProductResponseDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<MinProductResponseDto> getProductsByBrandAndName(String brand, String name) {
        return productRepository.findByBrandAndName(brand, name)
                .stream()
                .map(productMapper::toMinProductResponseDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<MinProductResponseDto> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category)
                .stream()
                .map(productMapper::toMinProductResponseDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<MinProductResponseDto> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrand(category, brand)
                .stream()
                .map(productMapper::toMinProductResponseDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<MinProductResponseDto> getProductsByName(String name) {
        return productRepository.findByName(name)
                .stream()
                .map(productMapper::toMinProductResponseDto)
                .toList();
    }

    @Override
    @Transactional
    public MinProductResponseDto updateProduct(Long productId, Product product) {
        // TODO Auto-generated method stub
        return null;
    }

}
