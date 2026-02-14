package com.gustavo.biblioteca_api.exception;

import com.gustavo.biblioteca_api.dto.ErroResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LivroNaoEncontradoException.class)
    public ResponseEntity<ErroResponse> handleLivroNaoEncontrado(LivroNaoEncontradoException ex) {
        ErroResponse erro = new ErroResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(erro);


    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErroResponse> handleRequisicaoInvalida(MethodArgumentNotValidException ex){

        String mensagem = "Dados inválidos";

        if (ex.getBindingResult().getFieldError() != null) {
            mensagem = ex.getBindingResult()
                    .getFieldError()
                    .getDefaultMessage();
        }
        ErroResponse erro = new ErroResponse(
                HttpStatus.BAD_REQUEST.value(),
                mensagem,
                LocalDateTime.now()
        );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(erro);
    }


}
