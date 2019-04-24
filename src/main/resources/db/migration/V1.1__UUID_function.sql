DELIMITER $$
CREATE FUNCTION GetUUID(id BINARY(16)) RETURNS VARCHAR(36)
  DETERMINISTIC
BEGIN
  DECLARE uuid varchar(36);
  set uuid = LOWER(CONCAT(
      SUBSTR(HEX(id), 1, 8), '-',
      SUBSTR(HEX(id), 9, 4), '-',
      SUBSTR(HEX(id), 13, 4), '-',
      SUBSTR(HEX(id), 17, 4), '-',
      SUBSTR(HEX(id), 21)));
  return uuid;
END;
$$
DELIMITER ;