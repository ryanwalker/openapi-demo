package com.kubra.prepay.api.resource;

import com.kubra.prepay.generated.api.AccountsApi;
import com.kubra.prepay.generated.model.AccountDto;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ApiConstants.API_VERSION)
public class AccountResource implements AccountsApi {


  @Override
  public ResponseEntity<AccountDto> registerAccount(@Valid AccountDto accountDto) {

    AccountDto accountResponse = new AccountDto();
    accountResponse.setId(UUID.randomUUID().toString());

    return ResponseEntity.ok(accountResponse);
  }
}
