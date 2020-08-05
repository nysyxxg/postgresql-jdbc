/* Automatically generated by GNU msgfmt.  Do not modify!  */
package org.postgresql.translation;
public class messages_ru extends java.util.ResourceBundle {
  private static final String[] table;
  static {
    String[] t = new String[538];
    t[0] = "";
    t[1] = "Project-Id-Version: JDBC Driver for PostgreSQL 8.x.x\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2016-01-07 15:09+0300\nLast-Translator: Vladimir Sitnikov <sitnikov.vladimir@gmail.com>\nLanguage-Team: pgsql-rus <pgsql-rus@yahoogroups.com>\nLanguage: ru_RU\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nX-Generator: Poedit 1.5.7\n";
    t[4] = "Server SQLState: {0}";
    t[5] = "SQLState сервера: {0}";
    t[14] = "suspend/resume not implemented";
    t[15] = "Операции XA suspend/resume не реализованы";
    t[18] = "The array index is out of range: {0}";
    t[19] = "Индекс массива вне диапазона: {0}";
    t[28] = "This PooledConnection has already been closed.";
    t[29] = "Это соединение уже было закрыто";
    t[30] = "Malformed function or procedure escape syntax at offset {0}.";
    t[31] = "Невозможно разобрать SQL команду. Ошибка на позиции {0}";
    t[32] = "The column index is out of range: {0}, number of columns: {1}.";
    t[33] = "Индекс колонки вне диапазона: {0}. Допустимые значения: 1..{1}";
    t[34] = "Premature end of input stream, expected {0} bytes, but only read {1}.";
    t[35] = "Раннее завершение входного потока, ожидалось байт: {0}, но считано только {1}";
    t[44] = "An I/O error occurred while sending to the backend.";
    t[45] = "Ошибка ввода/вывода при отправке бэкенду";
    t[46] = "Prepare called before end. prepare xid={0}, state={1}";
    t[47] = "Вызов prepare должен происходить только после вызова end. prepare xid={0}, state={1}";
    t[48] = "Transaction isolation level {0} not supported.";
    t[49] = "Уровень изоляции транзакций {0} не поддерживается.";
    t[50] = "Could not find a server with specified targetServerType: {0}";
    t[51] = "Не удалось найти сервер с указанным значением targetServerType: {0}";
    t[52] = "Conversion of interval failed";
    t[53] = "Невозможно обработать PGInterval: {0}";
    t[54] = "The array index is out of range: {0}, number of elements: {1}.";
    t[55] = "Индекс массива вне диапазона: {0}. Допустимые значения: 1..{1}";
    t[62] = "Unsupported value for stringtype parameter: {0}";
    t[63] = "Неподдерживаемое значение для параметра stringtype: {0}";
    t[72] = "Invalid stream length {0}.";
    t[73] = "Неверная длина потока {0}.";
    t[80] = "Error rolling back prepared transaction. rollback xid={0}, preparedXid={1}, currentXid={2}";
    t[81] = "Ошибка при откате подготовленной транзакции. rollback xid={0}, preparedXid={1}, currentXid={2}";
    t[84] = "The driver currently does not support COPY operations.";
    t[85] = "Драйвер в данный момент не поддерживате операции COPY.";
    t[94] = "DataSource has been closed.";
    t[95] = "DataSource закрыт.";
    t[96] = "Cannot write to copy a byte of value {0}";
    t[97] = "Значение byte должно быть в диапазоне 0..255, переданное значение: {0}";
    t[98] = "Fastpath call {0} - No result was returned and we expected a long.";
    t[99] = "Вызов fastpath {0} ничего не вернул, а ожидалось long";
    t[100] = "Connection attempt timed out.";
    t[101] = "Закончилось время ожидания";
    t[102] = "Detail: {0}";
    t[103] = "Подробности: {0}";
    t[104] = "Connection to {0} refused. Check that the hostname and port are correct and that the postmaster is accepting TCP/IP connections.";
    t[105] = "Подсоединение по адресу {0} отклонено. Проверьте что хост и порт указаны правильно и что postmaster принимает TCP/IP-подсоединения.";
    t[108] = "This statement has been closed.";
    t[109] = "Этот Sstatement был закрыт.";
    t[110] = "Error committing prepared transaction. commit xid={0}, preparedXid={1}, currentXid={2}";
    t[111] = "Ошибка при фиксации подготовленной транзакции. commit xid={0}, preparedXid={1}, currentXid={2}";
    t[114] = "Position: {0}";
    t[115] = "Позиция: {0}";
    t[116] = "Not implemented: Prepare must be issued using the same connection that started the transaction. currentXid={0}, prepare xid={1}";
    t[117] = "В каком соединении транзакцию начинали, в таком и вызывайте prepare. По-другому не работает. currentXid={0}, prepare xid={1}";
    t[118] = "The connection attempt failed.";
    t[119] = "Ошибка при попытке подсоединения.";
    t[120] = "Unexpected copydata from server for {0}";
    t[121] = "Неожиданный статус команды COPY: {0}";
    t[124] = "Illegal UTF-8 sequence: initial byte is {0}: {1}";
    t[125] = "Неверная последовательность UTF-8: начальное значеие {0}: {1}";
    t[128] = "This ResultSet is closed.";
    t[129] = "ResultSet закрыт.";
    t[142] = "Not implemented: 2nd phase commit must be issued using an idle connection. commit xid={0}, currentXid={1}, state={2}, transactionState={3}";
    t[143] = "Духфазная фиксация работает только, если соединение неактивно (state=idle и транзакцция отсутствует). commit xid={0}, currentXid={1}, state={2}, transactionState={3}";
    t[146] = "Too many update results were returned.";
    t[147] = "Возвращено слишком много результатов обновления.";
    t[148] = "An error occurred reading the certificate";
    t[149] = "Ошибка при чтении сертификата";
    t[160] = "Unknown type {0}.";
    t[161] = "Неизвестный тип {0}.";
    t[172] = "Illegal UTF-8 sequence: {0} bytes used to encode a {1} byte value: {2}";
    t[173] = "Неверная последовательность UTF-8: {0} bytes used to encode a {1} byte value: {2}";
    t[182] = "Protocol error.  Session setup failed.";
    t[183] = "Ошибка протокола.  Установление сессии не удалось.";
    t[184] = "Connection has been closed.";
    t[185] = "Это соединение уже было закрыто";
    t[188] = "This copy stream is closed.";
    t[189] = "Поток уже был закрыт";
    t[196] = "Statement has been closed.";
    t[197] = "Statement закрыт.";
    t[200] = "Failed to set ClientInfo property: {0}";
    t[201] = "Невозможно установить свойство ClientInfo: {0}";
    t[204] = "Where: {0}";
    t[205] = "Где: {0}";
    t[212] = "Expected command status BEGIN, got {0}.";
    t[213] = "Ожидался статус команды BEGIN, но получен {0}";
    t[216] = "The HostnameVerifier class provided {0} could not be instantiated.";
    t[217] = "Невозможно создать HostnameVerifier с помощью указанного класса {0}";
    t[220] = "Unsupported properties: {0}";
    t[221] = "Указанные свойства не поддерживаются: {0}";
    t[222] = "Failed to create object for: {0}.";
    t[223] = "Ошибка при создании объект для: {0}.";
    t[230] = "Something unusual has occurred to cause the driver to fail. Please report this exception.";
    t[231] = "Случилось что-то необычное, что заставило драйвер произвести ошибку. Пожалуйста сообщите это исключение.";
    t[236] = "Finalizing a Connection that was never closed:";
    t[237] = "Соединение «утекло». Проверьте, что в коде приложения вызывается connection.close(). Далее следует стектрейс того места, где создавалось проблемное соединение";
    t[238] = "Invalid character data was found.  This is most likely caused by stored data containing characters that are invalid for the character set the database was created in.  The most common example of this is storing 8bit data in a SQL_ASCII database.";
    t[239] = "Найдены неверные символьные данные.  Причиной этого скорее всего являются хранимые данные содержащие символы не соответствующие набору символов базы.  Типичным примером этого является хранение 8-битных данных в базе SQL_ASCII.";
    t[252] = "Unable to create SAXResult for SQLXML.";
    t[253] = "Невозможно создать SAXResult для SQLXML";
    t[260] = "The SSLSocketFactory class provided {0} could not be instantiated.";
    t[261] = "Невозможно создать SSLSocketFactory с помощью указанного класса {0}";
    t[266] = "No IOException expected from StringBuffer or StringBuilder";
    t[267] = "Что-то пошло не так: из классов StringBuffer и StringBuilder исключений не ожидалось";
    t[280] = "Interrupted while waiting to obtain lock on database connection";
    t[281] = "Ожидание COPY блокировки прервано получением interrupt";
    t[284] = "Zero bytes may not occur in identifiers.";
    t[285] = "Символ с кодом 0 в идентификаторах не допустим";
    t[286] = "There are no rows in this ResultSet.";
    t[287] = "Невозможно удалить строку, т.к. в текущем ResultSet’е строк вообще нет";
    t[288] = "Expected an EOF from server, got: {0}";
    t[289] = "Неожиданный ответ от сервера. Ожидалось окончание потока, получен байт {0}";
    t[304] = "No results were returned by the query.";
    t[305] = "Запрос не вернул результатов.";
    t[306] = "Invalid targetServerType value: {0}";
    t[307] = "Неверное значение targetServerType: {0}";
    t[310] = "Requested CopyOut but got {0}";
    t[311] = "Ожидался ответ CopyOut, а получен {0}";
    t[318] = "Invalid flags {0}";
    t[319] = "Неверные флаги {0}";
    t[324] = "Unsupported Types value: {0}";
    t[325] = "Неподдерживаемый java.sql.Types тип: {0}";
    t[326] = "Invalid timeout ({0}<0).";
    t[327] = "Значение таймаута должно быть неотрицательным: {0}";
    t[328] = "tried to call end without corresponding start call. state={0}, start xid={1}, currentXid={2}, preparedXid={3}";
    t[329] = "Невозможно завершить транзакцию, т.к. транзакция не была начата. state={0}, start xid={1}, currentXid={2}, preparedXid={3}";
    t[350] = "A result was returned when none was expected.";
    t[351] = "Результат возвращён когда его не ожидалось.";
    t[352] = "Unsupported binary encoding of {0}.";
    t[353] = "Бинарная передача не поддерживается для типа  {0}";
    t[354] = "Zero bytes may not occur in string parameters.";
    t[355] = "Байт с кодом 0 не может втречаться в строковых параметрах";
    t[360] = "Requested CopyIn but got {0}";
    t[361] = "Ожидался ответ CopyIn, а получен {0}";
    t[364] = "Error during one-phase commit. commit xid={0}";
    t[365] = "Ошибка при однофазной фиксации транзакции. commit xid={0}";
    t[372] = "Unable to bind parameter values for statement.";
    t[373] = "Не в состоянии ассоциировать значения параметров для команды (PGBindException)";
    t[374] = "Interrupted while attempting to connect.";
    t[375] = "Подключение прервано получаением interrupt";
    t[380] = "An unexpected result was returned by a query.";
    t[381] = "Запрос вернул неожиданный результат.";
    t[384] = "Method {0} is not yet implemented.";
    t[385] = "Метод {0} ещё не реализован";
    t[386] = "Location: File: {0}, Routine: {1}, Line: {2}";
    t[387] = "Местонахождение: Файл {0}, Процедура: {1}, Строка: {2}";
    t[388] = "The server does not support SSL.";
    t[389] = "Сервер не поддерживает SSL.";
    t[392] = "The password callback class provided {0} could not be instantiated.";
    t[393] = "Невозможно создать password callback с помощью указанного класса {0}";
    t[396] = "Unknown Types value.";
    t[397] = "Неизвестное значение Types.";
    t[400] = "Unknown Response Type {0}.";
    t[401] = "Неизвестный тип ответа {0}.";
    t[406] = "commit called before end. commit xid={0}, state={1}";
    t[407] = "Операция commit должна вызываться только после операции end. commit xid={0}, state={1}";
    t[420] = "An error occurred while setting up the SSL connection.";
    t[421] = "Ошибка при установке SSL-подсоединения.";
    t[424] = "Invalid sslmode value: {0}";
    t[425] = "Неверное значение sslmode: {0}";
    t[436] = "Copying from database failed: {0}";
    t[437] = "Ошибка при обработке ответа команды COPY: {0}";
    t[438] = "Illegal UTF-8 sequence: final value is out of range: {0}";
    t[439] = "Неверная последовательность UTF-8: финальное значение вне области допустимых: {0}";
    t[442] = "Error preparing transaction. prepare xid={0}";
    t[443] = "Ошибка при выполнении prepare для транзакции {0}";
    t[450] = "A connection could not be made using the requested protocol {0}.";
    t[451] = "Невозможно установить соединение с помощью протокола {0}";
    t[460] = "Invalid protocol state requested. Attempted transaction interleaving is not supported. xid={0}, currentXid={1}, state={2}, flags={3}";
    t[461] = "Чередование транзакций в одном соединении не поддерживается. Предыдущую транзакцию нужно завершить xid={0}, currentXid={1}, state={2}, flags={3}";
    t[462] = "Illegal UTF-8 sequence: final value is a surrogate value: {0}";
    t[463] = "Неверная последовательность UTF-8: финальное значение является surrogate значением: {0}";
    t[466] = "The column name {0} was not found in this ResultSet.";
    t[467] = "Колонки {0} не найдено в этом ResultSet’’е.";
    t[468] = "oid type {0} not known and not a number";
    t[469] = "Oid {0} не известен или не является числом";
    t[476] = "Hint: {0}";
    t[477] = "Подсказка: {0}";
    t[478] = "Unsupported property name: {0}";
    t[479] = "Свойство {0} не поддерживается";
    t[480] = "Ran out of memory retrieving query results.";
    t[481] = "Недостаточно памяти для обработки результатов запроса. Попробуйте увеличить -Xmx или проверьте размеры обрабатываемых данных";
    t[484] = "Interval {0} not yet implemented";
    t[485] = "Интеврвал {0} ещё не реализован";
    t[486] = "This connection has been closed.";
    t[487] = "Соединение уже было закрыто";
    t[488] = "The SocketFactory class provided {0} could not be instantiated.";
    t[489] = "Невозможно создать SSLSocketFactory с помощью указанного класса {0}";
    t[490] = "This SQLXML object has already been freed.";
    t[491] = "Этот объект SQLXML уже был закрыт";
    t[494] = "Unexpected command status: {0}.";
    t[495] = "Неожиданный статус команды: {0}.";
    t[502] = "Large Objects may not be used in auto-commit mode.";
    t[503] = "Большие объекты не могут использоваться в режиме авто-подтверждения (auto-commit).";
    t[504] = "Conversion of money failed.";
    t[505] = "Ошибка при преобразовании типа money.";
    t[512] = "No value specified for parameter {0}.";
    t[513] = "Не указано значение для параметра {0}.";
    t[514] = "The server requested password-based authentication, but no password was provided.";
    t[515] = "Сервер запросил парольную аутентификацию, но пароль не был указан.";
    t[518] = "Illegal UTF-8 sequence: byte {0} of {1} byte sequence is not 10xxxxxx: {2}";
    t[519] = "Неверная последовательность UTF-8: байт {0} из {1} не подходит к маске 10xxxxxx: {2}";
    t[522] = "Conversion to type {0} failed: {1}.";
    t[523] = "Ошибка при преобразовании к типу {0}: {1}";
    t[528] = "The authentication type {0} is not supported. Check that you have configured the pg_hba.conf file to include the client''s IP address or subnet, and that it is using an authentication scheme supported by the driver.";
    t[529] = "Тип аутентификации {0} не поддерживается. Проверьте если вы сконфигурировали файл pg_hba.conf чтобы включить IP-адреса клиентов или подсеть. Также удостовертесь что он использует схему аутентификации поддерживаемую драйвером.";
    t[534] = "The parameter index is out of range: {0}, number of parameters: {1}.";
    t[535] = "Индекс параметра вне диапазона: {0}. Допустимые значения: 1..{1}";
    table = t;
  }
  public Object handleGetObject (String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 269) << 1;
    {
      Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 267) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 538)
        idx -= 538;
      Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 538 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 538);
        }
        public Object nextElement () {
          Object key = table[idx];
          do idx += 2; while (idx < 538 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}