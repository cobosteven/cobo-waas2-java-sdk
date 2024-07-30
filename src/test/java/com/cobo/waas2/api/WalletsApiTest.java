/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.AddressInfo;
import com.cobo.waas2.model.ChainInfo;
import com.cobo.waas2.model.CheckAddressValidity200Response;
import com.cobo.waas2.model.CreateAddressRequest;
import com.cobo.waas2.model.CreateWalletParams;
import com.cobo.waas2.model.CreatedWalletInfo;
import com.cobo.waas2.model.DeleteWalletById201Response;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.ExtendedTokenInfo;
import com.cobo.waas2.model.ListAddresses200Response;
import com.cobo.waas2.model.ListSupportedChains200Response;
import com.cobo.waas2.model.ListSupportedTokens200Response;
import com.cobo.waas2.model.ListTokenBalancesForAddress200Response;
import com.cobo.waas2.model.ListUtxos200Response;
import com.cobo.waas2.model.ListWallets200Response;
import com.cobo.waas2.model.LockUtxos201Response;
import com.cobo.waas2.model.LockUtxosRequest;
import com.cobo.waas2.model.MaxTransferableValue;
import java.util.UUID;
import com.cobo.waas2.model.UpdateWalletParams;
import com.cobo.waas2.model.WalletInfo;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsApi
 */
@Disabled
public class WalletsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final WalletsApi api = new WalletsApi();

    /**
     * Check address validity
     *
     * This operation verifies if a given address is valid for a specific chain. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkAddressValidityTest() throws ApiException {
        String chainId = null;
        String address = null;
        CheckAddressValidity200Response response = api.checkAddressValidity(chainId, address);
        // TODO: test validations
    }

    /**
     * Create addresses in wallet
     *
     * This operation generates one or more addresses within a specified wallet.  &lt;Note&gt;This operation is applicable to Custodial Wallets and MPC Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAddressTest() throws ApiException {
        UUID walletId = null;
        CreateAddressRequest createAddressRequest = null;
        List<AddressInfo> response = api.createAddress(walletId, createAddressRequest);
        // TODO: test validations
    }

    /**
     * Create wallet
     *
     * This operation creates a wallet with the provided information. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWalletTest() throws ApiException {
        CreateWalletParams createWalletParams = null;
        CreatedWalletInfo response = api.createWallet(createWalletParams);
        // TODO: test validations
    }

    /**
     * Delete wallet
     *
     * This operation deletes a specified wallet.  &lt;Note&gt;This operation is applicable to Exchange Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWalletByIdTest() throws ApiException {
        UUID walletId = null;
        DeleteWalletById201Response response = api.deleteWalletById(walletId);
        // TODO: test validations
    }

    /**
     * Get address information
     *
     * This operation retrieves the detailed information about a specified address within a wallet. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAddressTest() throws ApiException {
        UUID walletId = null;
        String address = null;
        List<AddressInfo> response = api.getAddress(walletId, address);
        // TODO: test validations
    }

    /**
     * Get chain information
     *
     * This operation retrieves the detailed information about a specified chain. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChainByIdTest() throws ApiException {
        String chainId = null;
        ChainInfo response = api.getChainById(chainId);
        // TODO: test validations
    }

    /**
     * Get maximum transferable value
     *
     * This operation retrieves the maximum amount that you can transfer from a wallet or a specified wallet address, along with the corresponding transaction fee.  You must specify &#x60;to_address&#x60; in your query because it affects the transaction fee. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMaxTransferableValueTest() throws ApiException {
        UUID walletId = null;
        String tokenId = null;
        String feeRate = null;
        String toAddress = null;
        String fromAddress = null;
        MaxTransferableValue response = api.getMaxTransferableValue(walletId, tokenId, feeRate, toAddress, fromAddress);
        // TODO: test validations
    }

    /**
     * Get token information
     *
     * This operation retrieves the detailed information about a specified token. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenByIdTest() throws ApiException {
        String tokenId = null;
        ExtendedTokenInfo response = api.getTokenById(tokenId);
        // TODO: test validations
    }

    /**
     * Get wallet information
     *
     * This operation retrieves the detailed information about a specified wallet. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWalletByIdTest() throws ApiException {
        UUID walletId = null;
        WalletInfo response = api.getWalletById(walletId);
        // TODO: test validations
    }

    /**
     * List wallet addresses
     *
     * This operation retrieves a list of addresses within a specified wallet. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAddressesTest() throws ApiException {
        UUID walletId = null;
        String chainIds = null;
        String addresses = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListAddresses200Response response = api.listAddresses(walletId, chainIds, addresses, limit, before, after);
        // TODO: test validations
    }

    /**
     * List enabled chains
     *
     * This operation retrieves all the chains that can be used by your organization.   You can filter the result by wallet type or subtype. If you do not specify a wallet type, this operation returns a combination of chains that can be used by your organization for each wallet type. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEnabledChainsTest() throws ApiException {
        WalletType walletType = null;
        WalletSubtype walletSubtype = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListSupportedChains200Response response = api.listEnabledChains(walletType, walletSubtype, limit, before, after);
        // TODO: test validations
    }

    /**
     * List enabled tokens
     *
     * This operation retrieves all the tokens that can be used by your organization.   You can filter the result by wallet type, subtype, and chain IDs. If you do not specify a wallet type, this operation returns a combination of tokens that can be used by your organization for each wallet type. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEnabledTokensTest() throws ApiException {
        WalletType walletType = null;
        WalletSubtype walletSubtype = null;
        String chainIds = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListSupportedTokens200Response response = api.listEnabledTokens(walletType, walletSubtype, chainIds, limit, before, after);
        // TODO: test validations
    }

    /**
     * List supported chains
     *
     * This operation retrieves all chains supported by a specific wallet type or subtype.   It provides details such as the chain ID, chain symbol, and other relevant information. If you do not specify a wallet type, this operation returns a combination of chains supported by each wallet type. You can filter the result by chain IDs. The chain metadata is publicly available without any permission restrictions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSupportedChainsTest() throws ApiException {
        WalletType walletType = null;
        WalletSubtype walletSubtype = null;
        String chainIds = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListSupportedChains200Response response = api.listSupportedChains(walletType, walletSubtype, chainIds, limit, before, after);
        // TODO: test validations
    }

    /**
     * List supported tokens
     *
     * This operation retrieves all tokens supported by a specific wallet type or subtype.   It provides details such as token ID, token symbol, and other relevant information. If you do not specify a wallet type, this operation returns a combination of tokens supported by each wallet type. You can filter the result by token IDs or chain IDs. The token metadata is publicly available without any permission restrictions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSupportedTokensTest() throws ApiException {
        WalletType walletType = null;
        WalletSubtype walletSubtype = null;
        String chainIds = null;
        String tokenIds = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListSupportedTokens200Response response = api.listSupportedTokens(walletType, walletSubtype, chainIds, tokenIds, limit, before, after);
        // TODO: test validations
    }

    /**
     * List token balances by address
     *
     * The operation retrieves a list of token balances for a specified address within an MPC Wallet.   &lt;Note&gt;This operation is applicable to MPC Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTokenBalancesForAddressTest() throws ApiException {
        UUID walletId = null;
        String address = null;
        String tokenIds = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListTokenBalancesForAddress200Response response = api.listTokenBalancesForAddress(walletId, address, tokenIds, limit, before, after);
        // TODO: test validations
    }

    /**
     * List token balances by wallet
     *
     * The operation retrieves a list of token balances within a specified wallet.  &lt;Note&gt;This operation is applicable to Custodial Wallets and MPC Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTokenBalancesForWalletTest() throws ApiException {
        UUID walletId = null;
        String tokenIds = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListTokenBalancesForAddress200Response response = api.listTokenBalancesForWallet(walletId, tokenIds, limit, before, after);
        // TODO: test validations
    }

    /**
     * List UTXOs
     *
     * The operation retrieves a list of unspent transaction outputs (UTXOs) for a specified wallet and token.  &lt;Note&gt;This operation is applicable to MPC Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUtxosTest() throws ApiException {
        UUID walletId = null;
        String tokenId = null;
        String address = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListUtxos200Response response = api.listUtxos(walletId, tokenId, address, limit, before, after);
        // TODO: test validations
    }

    /**
     * List all wallets
     *
     * This operation retrieves the information of all wallets under your organization. You can filter the result by wallet type and subtype. For MPC Wallets, you can also filter by project ID and vault ID.  &lt;Note&gt;You must specify either the wallet type or subtype, or both.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWalletsTest() throws ApiException {
        WalletType walletType = null;
        WalletSubtype walletSubtype = null;
        UUID projectId = null;
        UUID vaultId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListWallets200Response response = api.listWallets(walletType, walletSubtype, projectId, vaultId, limit, before, after);
        // TODO: test validations
    }

    /**
     * Lock UTXOs
     *
     * This operation locks the UTXOs with specified transaction hashes. Locked UTXOs cannot be transferred until unlocked.  &lt;Note&gt;This operation is applicable to MPC Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lockUtxosTest() throws ApiException {
        UUID walletId = null;
        LockUtxosRequest lockUtxosRequest = null;
        LockUtxos201Response response = api.lockUtxos(walletId, lockUtxosRequest);
        // TODO: test validations
    }

    /**
     * Unlock UTXOs
     *
     * This operation unlocks the UTXOs with specified transaction hashes. Locked UTXOs cannot be transferred until unlocked.  &lt;Note&gt;This operation is applicable to MPC Wallets only.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unlockUtxosTest() throws ApiException {
        UUID walletId = null;
        LockUtxosRequest lockUtxosRequest = null;
        LockUtxos201Response response = api.unlockUtxos(walletId, lockUtxosRequest);
        // TODO: test validations
    }

    /**
     * Update wallet
     *
     * This operation updates the information of a specified wallet.  For Exchange Wallets, you can update the API key, API secret, and other information about your exchange accounts with this operation. For other wallet types, you can only update the wallet name. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWalletByIdTest() throws ApiException {
        UUID walletId = null;
        UpdateWalletParams updateWalletParams = null;
        WalletInfo response = api.updateWalletById(walletId, updateWalletParams);
        // TODO: test validations
    }

}