INSERT INTO T_ACCOUNT_TYPE (ID, ACCOUNTTYPE) 
VALUES (1, 'Current');

INSERT INTO T_ACCOUNT_TYPE (ID, ACCOUNTTYPE) 
VALUES (2, 'Savings');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (1, 585309209, 'SGSavings726', 2, 84327.51, 'SGD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (2, 791066619, 'AUSavings933', 2, 88005.93, 'AUD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (3, 321143048, 'AUCurrent433', 1, 38010.62, 'AUD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (4, 347786244, 'SGCurrent166', 1, 50664.65, 'SGD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (5, 680168913, 'AUCurrent374', 1, 41327.28, 'AUD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (6, 136056165, 'AUSavings938', 2, 48928.79, 'AUD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (7, 453863528, 'SGSavings842', 2, 72117.53, 'SGD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (8, 334666982, 'AUSavings253', 2, 20588.16, 'AUD');

INSERT INTO T_ACCOUNTS (ID, ACCOUNTNUMBER, ACCOUNTNAME, ACCOUNTTYPEID, ACCOUNTBALANCE, CURRENCY)
VALUES (9, 793949180, 'AUCurrent754', 1, 88794.48, 'AUD');

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (1, '2018-03-26', 800.26, 'Debit', 'SGD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (1, '2018-06-26', 3800.00, 'Credit', 'SGD', 'Return of credit - by joseph');

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (1, '2019-03-27', 6800.00, 'Debit', 'SGD', 'College tution fee payment');

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (2, '2019-01-01', 1800.00, 'Debit', 'EUR', 'Tour de france');

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (2, '2019-01-10', 1600.78, 'Credit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (3, '2019-05-15', 199.99, 'Debit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (4, '2019-04-06', 334.45, 'Credit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (4, '2019-06-06', 400.00, 'Debit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (5, '2019-03-03', 1876.90, 'Debit', 'SGD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (5, '2019-02-01', 570.00, 'Credit', 'SGD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (6, '2019-03-19', 219.19, 'Debit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (7, '2019-02-27', 16619, 'Debit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (8, '2019-01-30', 1119.19, 'Credit', 'SGD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (9, '2019-05-30', 419.49, 'Debit', 'AUD', null);

INSERT INTO T_TRANSACTION (ACCOUNTID, TRANSACTIONDATE, TRANSACTIONAMOUNT, TRANSACTIONTYPE, CURRENCY, COMMENTS) 
VALUES (9, '2019-06-01', 19.19, 'Credit', 'AUD', null);