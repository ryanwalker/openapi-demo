CREATE TABLE `account` (
    id                  BINARY(16)  PRIMARY KEY,
    tenant_id           BINARY(16)  NOT NULL,
    external_account_id VARCHAR(128)  ,
    account_status      VARCHAR(50) NOT NULL DEFAULT 'INACTIVE',
    created             TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated             TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE UNIQUE INDEX account_external_account_id ON account (tenant_id, external_account_id);