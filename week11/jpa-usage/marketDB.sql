toc.dat                                                                                             0000600 0004000 0002000 00000052657 14621652442 0014464 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP                       |            market    16.2    16.2 H    5           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false         6           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false         7           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false         8           1262    16891    market    DATABASE     �   CREATE DATABASE market WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE market;
                postgres    false         �            1259    25686 
   categories    TABLE     o   CREATE TABLE public.categories (
    category_id integer NOT NULL,
    category_name character varying(255)
);
    DROP TABLE public.categories;
       public         heap    postgres    false         �            1259    25685    categories_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.categories_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categories_category_id_seq;
       public          postgres    false    216         9           0    0    categories_category_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;
          public          postgres    false    215         �            1259    25693    codes    TABLE     �   CREATE TABLE public.codes (
    code_id integer NOT NULL,
    code_group character varying(255) NOT NULL,
    code_serial character varying(255) NOT NULL
);
    DROP TABLE public.codes;
       public         heap    postgres    false         �            1259    25692    codes_code_id_seq    SEQUENCE     �   CREATE SEQUENCE public.codes_code_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.codes_code_id_seq;
       public          postgres    false    218         :           0    0    codes_code_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.codes_code_id_seq OWNED BY public.codes.code_id;
          public          postgres    false    217         �            1259    25702    colors    TABLE     n   CREATE TABLE public.colors (
    color_id integer NOT NULL,
    color_name character varying(255) NOT NULL
);
    DROP TABLE public.colors;
       public         heap    postgres    false         �            1259    25701    colors_color_id_seq    SEQUENCE     �   CREATE SEQUENCE public.colors_color_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.colors_color_id_seq;
       public          postgres    false    220         ;           0    0    colors_color_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.colors_color_id_seq OWNED BY public.colors.color_id;
          public          postgres    false    219         �            1259    25709 	   customers    TABLE     �  CREATE TABLE public.customers (
    customer_id integer NOT NULL,
    customer_on_date date,
    customer_name character varying(100) NOT NULL,
    customer_gender character varying(255),
    customer_mail character varying(255) NOT NULL,
    CONSTRAINT customers_customer_gender_check CHECK (((customer_gender)::text = ANY ((ARRAY['MALE'::character varying, 'FEMALE'::character varying])::text[])))
);
    DROP TABLE public.customers;
       public         heap    postgres    false         �            1259    25708    customers_customer_id_seq    SEQUENCE     �   CREATE SEQUENCE public.customers_customer_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.customers_customer_id_seq;
       public          postgres    false    222         <           0    0    customers_customer_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.customers_customer_id_seq OWNED BY public.customers.customer_id;
          public          postgres    false    221         �            1259    25722 
   pro2colors    TABLE     w   CREATE TABLE public.pro2colors (
    pro2color_color_id integer NOT NULL,
    pro2color_product_id integer NOT NULL
);
    DROP TABLE public.pro2colors;
       public         heap    postgres    false         �            1259    25720 !   pro2colors_pro2color_color_id_seq    SEQUENCE     �   CREATE SEQUENCE public.pro2colors_pro2color_color_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 8   DROP SEQUENCE public.pro2colors_pro2color_color_id_seq;
       public          postgres    false    225         =           0    0 !   pro2colors_pro2color_color_id_seq    SEQUENCE OWNED BY     g   ALTER SEQUENCE public.pro2colors_pro2color_color_id_seq OWNED BY public.pro2colors.pro2color_color_id;
          public          postgres    false    223         �            1259    25721 #   pro2colors_pro2color_product_id_seq    SEQUENCE     �   CREATE SEQUENCE public.pro2colors_pro2color_product_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public.pro2colors_pro2color_product_id_seq;
       public          postgres    false    225         >           0    0 #   pro2colors_pro2color_product_id_seq    SEQUENCE OWNED BY     k   ALTER SEQUENCE public.pro2colors_pro2color_product_id_seq OWNED BY public.pro2colors.pro2color_product_id;
          public          postgres    false    224         �            1259    25730    products    TABLE     "  CREATE TABLE public.products (
    product_category_id integer,
    product_code_id integer NOT NULL,
    product_id integer NOT NULL,
    product_prc integer NOT NULL,
    product_stock integer,
    product_supplier_id integer NOT NULL,
    product_name character varying(255) NOT NULL
);
    DROP TABLE public.products;
       public         heap    postgres    false         �            1259    25727    products_product_code_id_seq    SEQUENCE     �   CREATE SEQUENCE public.products_product_code_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.products_product_code_id_seq;
       public          postgres    false    229         ?           0    0    products_product_code_id_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.products_product_code_id_seq OWNED BY public.products.product_code_id;
          public          postgres    false    226         �            1259    25728    products_product_id_seq    SEQUENCE     �   CREATE SEQUENCE public.products_product_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.products_product_id_seq;
       public          postgres    false    229         @           0    0    products_product_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.products_product_id_seq OWNED BY public.products.product_id;
          public          postgres    false    227         �            1259    25729     products_product_supplier_id_seq    SEQUENCE     �   CREATE SEQUENCE public.products_product_supplier_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 7   DROP SEQUENCE public.products_product_supplier_id_seq;
       public          postgres    false    229         A           0    0     products_product_supplier_id_seq    SEQUENCE OWNED BY     e   ALTER SEQUENCE public.products_product_supplier_id_seq OWNED BY public.products.product_supplier_id;
          public          postgres    false    228         �            1259    25741 	   suppliers    TABLE     !  CREATE TABLE public.suppliers (
    supplier_id integer NOT NULL,
    supplier_address character varying(255),
    supplier_company character varying(255),
    supplier_contact character varying(255),
    supplier_mail character varying(255),
    supplier_person character varying(255)
);
    DROP TABLE public.suppliers;
       public         heap    postgres    false         �            1259    25740    suppliers_supplier_id_seq    SEQUENCE     �   CREATE SEQUENCE public.suppliers_supplier_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.suppliers_supplier_id_seq;
       public          postgres    false    231         B           0    0    suppliers_supplier_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.suppliers_supplier_id_seq OWNED BY public.suppliers.supplier_id;
          public          postgres    false    230         q           2604    25689    categories category_id    DEFAULT     �   ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);
 E   ALTER TABLE public.categories ALTER COLUMN category_id DROP DEFAULT;
       public          postgres    false    215    216    216         r           2604    25696    codes code_id    DEFAULT     n   ALTER TABLE ONLY public.codes ALTER COLUMN code_id SET DEFAULT nextval('public.codes_code_id_seq'::regclass);
 <   ALTER TABLE public.codes ALTER COLUMN code_id DROP DEFAULT;
       public          postgres    false    218    217    218         s           2604    25705    colors color_id    DEFAULT     r   ALTER TABLE ONLY public.colors ALTER COLUMN color_id SET DEFAULT nextval('public.colors_color_id_seq'::regclass);
 >   ALTER TABLE public.colors ALTER COLUMN color_id DROP DEFAULT;
       public          postgres    false    220    219    220         t           2604    25712    customers customer_id    DEFAULT     ~   ALTER TABLE ONLY public.customers ALTER COLUMN customer_id SET DEFAULT nextval('public.customers_customer_id_seq'::regclass);
 D   ALTER TABLE public.customers ALTER COLUMN customer_id DROP DEFAULT;
       public          postgres    false    221    222    222         u           2604    25725    pro2colors pro2color_color_id    DEFAULT     �   ALTER TABLE ONLY public.pro2colors ALTER COLUMN pro2color_color_id SET DEFAULT nextval('public.pro2colors_pro2color_color_id_seq'::regclass);
 L   ALTER TABLE public.pro2colors ALTER COLUMN pro2color_color_id DROP DEFAULT;
       public          postgres    false    223    225    225         v           2604    25726    pro2colors pro2color_product_id    DEFAULT     �   ALTER TABLE ONLY public.pro2colors ALTER COLUMN pro2color_product_id SET DEFAULT nextval('public.pro2colors_pro2color_product_id_seq'::regclass);
 N   ALTER TABLE public.pro2colors ALTER COLUMN pro2color_product_id DROP DEFAULT;
       public          postgres    false    224    225    225         w           2604    25733    products product_code_id    DEFAULT     �   ALTER TABLE ONLY public.products ALTER COLUMN product_code_id SET DEFAULT nextval('public.products_product_code_id_seq'::regclass);
 G   ALTER TABLE public.products ALTER COLUMN product_code_id DROP DEFAULT;
       public          postgres    false    229    226    229         x           2604    25734    products product_id    DEFAULT     z   ALTER TABLE ONLY public.products ALTER COLUMN product_id SET DEFAULT nextval('public.products_product_id_seq'::regclass);
 B   ALTER TABLE public.products ALTER COLUMN product_id DROP DEFAULT;
       public          postgres    false    229    227    229         y           2604    25735    products product_supplier_id    DEFAULT     �   ALTER TABLE ONLY public.products ALTER COLUMN product_supplier_id SET DEFAULT nextval('public.products_product_supplier_id_seq'::regclass);
 K   ALTER TABLE public.products ALTER COLUMN product_supplier_id DROP DEFAULT;
       public          postgres    false    228    229    229         z           2604    25744    suppliers supplier_id    DEFAULT     ~   ALTER TABLE ONLY public.suppliers ALTER COLUMN supplier_id SET DEFAULT nextval('public.suppliers_supplier_id_seq'::regclass);
 D   ALTER TABLE public.suppliers ALTER COLUMN supplier_id DROP DEFAULT;
       public          postgres    false    230    231    231         #          0    25686 
   categories 
   TABLE DATA           @   COPY public.categories (category_id, category_name) FROM stdin;
    public          postgres    false    216       4899.dat %          0    25693    codes 
   TABLE DATA           A   COPY public.codes (code_id, code_group, code_serial) FROM stdin;
    public          postgres    false    218       4901.dat '          0    25702    colors 
   TABLE DATA           6   COPY public.colors (color_id, color_name) FROM stdin;
    public          postgres    false    220       4903.dat )          0    25709 	   customers 
   TABLE DATA           q   COPY public.customers (customer_id, customer_on_date, customer_name, customer_gender, customer_mail) FROM stdin;
    public          postgres    false    222       4905.dat ,          0    25722 
   pro2colors 
   TABLE DATA           N   COPY public.pro2colors (pro2color_color_id, pro2color_product_id) FROM stdin;
    public          postgres    false    225       4908.dat 0          0    25730    products 
   TABLE DATA           �   COPY public.products (product_category_id, product_code_id, product_id, product_prc, product_stock, product_supplier_id, product_name) FROM stdin;
    public          postgres    false    229       4912.dat 2          0    25741 	   suppliers 
   TABLE DATA           �   COPY public.suppliers (supplier_id, supplier_address, supplier_company, supplier_contact, supplier_mail, supplier_person) FROM stdin;
    public          postgres    false    231       4914.dat C           0    0    categories_category_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.categories_category_id_seq', 1, true);
          public          postgres    false    215         D           0    0    codes_code_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.codes_code_id_seq', 1, true);
          public          postgres    false    217         E           0    0    colors_color_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.colors_color_id_seq', 3, true);
          public          postgres    false    219         F           0    0    customers_customer_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.customers_customer_id_seq', 1, false);
          public          postgres    false    221         G           0    0 !   pro2colors_pro2color_color_id_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.pro2colors_pro2color_color_id_seq', 1, false);
          public          postgres    false    223         H           0    0 #   pro2colors_pro2color_product_id_seq    SEQUENCE SET     R   SELECT pg_catalog.setval('public.pro2colors_pro2color_product_id_seq', 1, false);
          public          postgres    false    224         I           0    0    products_product_code_id_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.products_product_code_id_seq', 1, false);
          public          postgres    false    226         J           0    0    products_product_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.products_product_id_seq', 1, true);
          public          postgres    false    227         K           0    0     products_product_supplier_id_seq    SEQUENCE SET     O   SELECT pg_catalog.setval('public.products_product_supplier_id_seq', 1, false);
          public          postgres    false    228         L           0    0    suppliers_supplier_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.suppliers_supplier_id_seq', 1, true);
          public          postgres    false    230         }           2606    25691    categories categories_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    216                    2606    25700    codes codes_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.codes
    ADD CONSTRAINT codes_pkey PRIMARY KEY (code_id);
 :   ALTER TABLE ONLY public.codes DROP CONSTRAINT codes_pkey;
       public            postgres    false    218         �           2606    25707    colors colors_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.colors
    ADD CONSTRAINT colors_pkey PRIMARY KEY (color_id);
 <   ALTER TABLE ONLY public.colors DROP CONSTRAINT colors_pkey;
       public            postgres    false    220         �           2606    25719 %   customers customers_customer_mail_key 
   CONSTRAINT     i   ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_customer_mail_key UNIQUE (customer_mail);
 O   ALTER TABLE ONLY public.customers DROP CONSTRAINT customers_customer_mail_key;
       public            postgres    false    222         �           2606    25717    customers customers_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY (customer_id);
 B   ALTER TABLE ONLY public.customers DROP CONSTRAINT customers_pkey;
       public            postgres    false    222         �           2606    25737    products products_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (product_id);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    229         �           2606    25739 %   products products_product_code_id_key 
   CONSTRAINT     k   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_product_code_id_key UNIQUE (product_code_id);
 O   ALTER TABLE ONLY public.products DROP CONSTRAINT products_product_code_id_key;
       public            postgres    false    229         �           2606    25748    suppliers suppliers_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.suppliers
    ADD CONSTRAINT suppliers_pkey PRIMARY KEY (supplier_id);
 B   ALTER TABLE ONLY public.suppliers DROP CONSTRAINT suppliers_pkey;
       public            postgres    false    231         �           2606    25750 %   suppliers suppliers_supplier_mail_key 
   CONSTRAINT     i   ALTER TABLE ONLY public.suppliers
    ADD CONSTRAINT suppliers_supplier_mail_key UNIQUE (supplier_mail);
 O   ALTER TABLE ONLY public.suppliers DROP CONSTRAINT suppliers_supplier_mail_key;
       public            postgres    false    231         �           2606    25766 $   products fkdws4w338skjnkl5gvo34w8v6d    FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkdws4w338skjnkl5gvo34w8v6d FOREIGN KEY (product_code_id) REFERENCES public.codes(code_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkdws4w338skjnkl5gvo34w8v6d;
       public          postgres    false    229    4735    218         �           2606    25771 $   products fkenfmihfwhl9kir08xnaew21pc    FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkenfmihfwhl9kir08xnaew21pc FOREIGN KEY (product_supplier_id) REFERENCES public.suppliers(supplier_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkenfmihfwhl9kir08xnaew21pc;
       public          postgres    false    4747    229    231         �           2606    25751 &   pro2colors fkgqtsp0d1f344uocx1wxkpuw6r    FK CONSTRAINT     �   ALTER TABLE ONLY public.pro2colors
    ADD CONSTRAINT fkgqtsp0d1f344uocx1wxkpuw6r FOREIGN KEY (pro2color_color_id) REFERENCES public.colors(color_id);
 P   ALTER TABLE ONLY public.pro2colors DROP CONSTRAINT fkgqtsp0d1f344uocx1wxkpuw6r;
       public          postgres    false    220    4737    225         �           2606    25761 $   products fkp7dy0okc2p35dj70wl4grqlw4    FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkp7dy0okc2p35dj70wl4grqlw4 FOREIGN KEY (product_category_id) REFERENCES public.categories(category_id);
 N   ALTER TABLE ONLY public.products DROP CONSTRAINT fkp7dy0okc2p35dj70wl4grqlw4;
       public          postgres    false    216    4733    229         �           2606    25756 &   pro2colors fkpab8koqccjmgd43dfjpil7sme    FK CONSTRAINT     �   ALTER TABLE ONLY public.pro2colors
    ADD CONSTRAINT fkpab8koqccjmgd43dfjpil7sme FOREIGN KEY (pro2color_product_id) REFERENCES public.products(product_id);
 P   ALTER TABLE ONLY public.pro2colors DROP CONSTRAINT fkpab8koqccjmgd43dfjpil7sme;
       public          postgres    false    225    229    4743                                                                                         4899.dat                                                                                            0000600 0004000 0002000 00000000016 14621652442 0014272 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	Phones
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  4901.dat                                                                                            0000600 0004000 0002000 00000000022 14621652442 0014247 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	1112	52454
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4903.dat                                                                                            0000600 0004000 0002000 00000000032 14621652442 0014252 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	Blue
2	Black
3	Red
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      4905.dat                                                                                            0000600 0004000 0002000 00000000005 14621652442 0014254 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4908.dat                                                                                            0000600 0004000 0002000 00000000015 14621652442 0014260 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	1
2	1
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   4912.dat                                                                                            0000600 0004000 0002000 00000000047 14621652442 0014260 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	1	1	111111	1223	1	iphone 7 plus
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         4914.dat                                                                                            0000600 0004000 0002000 00000000065 14621652442 0014262 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	Adres	Company	270960	info@batuhan.com	Batuhan
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                           restore.sql                                                                                         0000600 0004000 0002000 00000042401 14621652442 0015373 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
-- NOTE:
--
-- File paths need to be edited. Search for $$PATH$$ and
-- replace it with the path to the directory containing
-- the extracted data files.
--
--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE market;
--
-- Name: market; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE market WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';


ALTER DATABASE market OWNER TO postgres;

\connect market

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: categories; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categories (
    category_id integer NOT NULL,
    category_name character varying(255)
);


ALTER TABLE public.categories OWNER TO postgres;

--
-- Name: categories_category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.categories_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.categories_category_id_seq OWNER TO postgres;

--
-- Name: categories_category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;


--
-- Name: codes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.codes (
    code_id integer NOT NULL,
    code_group character varying(255) NOT NULL,
    code_serial character varying(255) NOT NULL
);


ALTER TABLE public.codes OWNER TO postgres;

--
-- Name: codes_code_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.codes_code_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.codes_code_id_seq OWNER TO postgres;

--
-- Name: codes_code_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.codes_code_id_seq OWNED BY public.codes.code_id;


--
-- Name: colors; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.colors (
    color_id integer NOT NULL,
    color_name character varying(255) NOT NULL
);


ALTER TABLE public.colors OWNER TO postgres;

--
-- Name: colors_color_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.colors_color_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.colors_color_id_seq OWNER TO postgres;

--
-- Name: colors_color_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.colors_color_id_seq OWNED BY public.colors.color_id;


--
-- Name: customers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.customers (
    customer_id integer NOT NULL,
    customer_on_date date,
    customer_name character varying(100) NOT NULL,
    customer_gender character varying(255),
    customer_mail character varying(255) NOT NULL,
    CONSTRAINT customers_customer_gender_check CHECK (((customer_gender)::text = ANY ((ARRAY['MALE'::character varying, 'FEMALE'::character varying])::text[])))
);


ALTER TABLE public.customers OWNER TO postgres;

--
-- Name: customers_customer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.customers_customer_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.customers_customer_id_seq OWNER TO postgres;

--
-- Name: customers_customer_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.customers_customer_id_seq OWNED BY public.customers.customer_id;


--
-- Name: pro2colors; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pro2colors (
    pro2color_color_id integer NOT NULL,
    pro2color_product_id integer NOT NULL
);


ALTER TABLE public.pro2colors OWNER TO postgres;

--
-- Name: pro2colors_pro2color_color_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pro2colors_pro2color_color_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.pro2colors_pro2color_color_id_seq OWNER TO postgres;

--
-- Name: pro2colors_pro2color_color_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pro2colors_pro2color_color_id_seq OWNED BY public.pro2colors.pro2color_color_id;


--
-- Name: pro2colors_pro2color_product_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pro2colors_pro2color_product_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.pro2colors_pro2color_product_id_seq OWNER TO postgres;

--
-- Name: pro2colors_pro2color_product_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pro2colors_pro2color_product_id_seq OWNED BY public.pro2colors.pro2color_product_id;


--
-- Name: products; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.products (
    product_category_id integer,
    product_code_id integer NOT NULL,
    product_id integer NOT NULL,
    product_prc integer NOT NULL,
    product_stock integer,
    product_supplier_id integer NOT NULL,
    product_name character varying(255) NOT NULL
);


ALTER TABLE public.products OWNER TO postgres;

--
-- Name: products_product_code_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.products_product_code_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.products_product_code_id_seq OWNER TO postgres;

--
-- Name: products_product_code_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.products_product_code_id_seq OWNED BY public.products.product_code_id;


--
-- Name: products_product_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.products_product_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.products_product_id_seq OWNER TO postgres;

--
-- Name: products_product_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.products_product_id_seq OWNED BY public.products.product_id;


--
-- Name: products_product_supplier_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.products_product_supplier_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.products_product_supplier_id_seq OWNER TO postgres;

--
-- Name: products_product_supplier_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.products_product_supplier_id_seq OWNED BY public.products.product_supplier_id;


--
-- Name: suppliers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.suppliers (
    supplier_id integer NOT NULL,
    supplier_address character varying(255),
    supplier_company character varying(255),
    supplier_contact character varying(255),
    supplier_mail character varying(255),
    supplier_person character varying(255)
);


ALTER TABLE public.suppliers OWNER TO postgres;

--
-- Name: suppliers_supplier_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.suppliers_supplier_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.suppliers_supplier_id_seq OWNER TO postgres;

--
-- Name: suppliers_supplier_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.suppliers_supplier_id_seq OWNED BY public.suppliers.supplier_id;


--
-- Name: categories category_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);


--
-- Name: codes code_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.codes ALTER COLUMN code_id SET DEFAULT nextval('public.codes_code_id_seq'::regclass);


--
-- Name: colors color_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.colors ALTER COLUMN color_id SET DEFAULT nextval('public.colors_color_id_seq'::regclass);


--
-- Name: customers customer_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers ALTER COLUMN customer_id SET DEFAULT nextval('public.customers_customer_id_seq'::regclass);


--
-- Name: pro2colors pro2color_color_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pro2colors ALTER COLUMN pro2color_color_id SET DEFAULT nextval('public.pro2colors_pro2color_color_id_seq'::regclass);


--
-- Name: pro2colors pro2color_product_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pro2colors ALTER COLUMN pro2color_product_id SET DEFAULT nextval('public.pro2colors_pro2color_product_id_seq'::regclass);


--
-- Name: products product_code_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products ALTER COLUMN product_code_id SET DEFAULT nextval('public.products_product_code_id_seq'::regclass);


--
-- Name: products product_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products ALTER COLUMN product_id SET DEFAULT nextval('public.products_product_id_seq'::regclass);


--
-- Name: products product_supplier_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products ALTER COLUMN product_supplier_id SET DEFAULT nextval('public.products_product_supplier_id_seq'::regclass);


--
-- Name: suppliers supplier_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.suppliers ALTER COLUMN supplier_id SET DEFAULT nextval('public.suppliers_supplier_id_seq'::regclass);


--
-- Data for Name: categories; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.categories (category_id, category_name) FROM stdin;
\.
COPY public.categories (category_id, category_name) FROM '$$PATH$$/4899.dat';

--
-- Data for Name: codes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.codes (code_id, code_group, code_serial) FROM stdin;
\.
COPY public.codes (code_id, code_group, code_serial) FROM '$$PATH$$/4901.dat';

--
-- Data for Name: colors; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.colors (color_id, color_name) FROM stdin;
\.
COPY public.colors (color_id, color_name) FROM '$$PATH$$/4903.dat';

--
-- Data for Name: customers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.customers (customer_id, customer_on_date, customer_name, customer_gender, customer_mail) FROM stdin;
\.
COPY public.customers (customer_id, customer_on_date, customer_name, customer_gender, customer_mail) FROM '$$PATH$$/4905.dat';

--
-- Data for Name: pro2colors; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pro2colors (pro2color_color_id, pro2color_product_id) FROM stdin;
\.
COPY public.pro2colors (pro2color_color_id, pro2color_product_id) FROM '$$PATH$$/4908.dat';

--
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.products (product_category_id, product_code_id, product_id, product_prc, product_stock, product_supplier_id, product_name) FROM stdin;
\.
COPY public.products (product_category_id, product_code_id, product_id, product_prc, product_stock, product_supplier_id, product_name) FROM '$$PATH$$/4912.dat';

--
-- Data for Name: suppliers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.suppliers (supplier_id, supplier_address, supplier_company, supplier_contact, supplier_mail, supplier_person) FROM stdin;
\.
COPY public.suppliers (supplier_id, supplier_address, supplier_company, supplier_contact, supplier_mail, supplier_person) FROM '$$PATH$$/4914.dat';

--
-- Name: categories_category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.categories_category_id_seq', 1, true);


--
-- Name: codes_code_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.codes_code_id_seq', 1, true);


--
-- Name: colors_color_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.colors_color_id_seq', 3, true);


--
-- Name: customers_customer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.customers_customer_id_seq', 1, false);


--
-- Name: pro2colors_pro2color_color_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pro2colors_pro2color_color_id_seq', 1, false);


--
-- Name: pro2colors_pro2color_product_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pro2colors_pro2color_product_id_seq', 1, false);


--
-- Name: products_product_code_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.products_product_code_id_seq', 1, false);


--
-- Name: products_product_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.products_product_id_seq', 1, true);


--
-- Name: products_product_supplier_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.products_product_supplier_id_seq', 1, false);


--
-- Name: suppliers_supplier_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.suppliers_supplier_id_seq', 1, true);


--
-- Name: categories categories_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);


--
-- Name: codes codes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.codes
    ADD CONSTRAINT codes_pkey PRIMARY KEY (code_id);


--
-- Name: colors colors_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.colors
    ADD CONSTRAINT colors_pkey PRIMARY KEY (color_id);


--
-- Name: customers customers_customer_mail_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_customer_mail_key UNIQUE (customer_mail);


--
-- Name: customers customers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY (customer_id);


--
-- Name: products products_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (product_id);


--
-- Name: products products_product_code_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_product_code_id_key UNIQUE (product_code_id);


--
-- Name: suppliers suppliers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.suppliers
    ADD CONSTRAINT suppliers_pkey PRIMARY KEY (supplier_id);


--
-- Name: suppliers suppliers_supplier_mail_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.suppliers
    ADD CONSTRAINT suppliers_supplier_mail_key UNIQUE (supplier_mail);


--
-- Name: products fkdws4w338skjnkl5gvo34w8v6d; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkdws4w338skjnkl5gvo34w8v6d FOREIGN KEY (product_code_id) REFERENCES public.codes(code_id);


--
-- Name: products fkenfmihfwhl9kir08xnaew21pc; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkenfmihfwhl9kir08xnaew21pc FOREIGN KEY (product_supplier_id) REFERENCES public.suppliers(supplier_id);


--
-- Name: pro2colors fkgqtsp0d1f344uocx1wxkpuw6r; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pro2colors
    ADD CONSTRAINT fkgqtsp0d1f344uocx1wxkpuw6r FOREIGN KEY (pro2color_color_id) REFERENCES public.colors(color_id);


--
-- Name: products fkp7dy0okc2p35dj70wl4grqlw4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.products
    ADD CONSTRAINT fkp7dy0okc2p35dj70wl4grqlw4 FOREIGN KEY (product_category_id) REFERENCES public.categories(category_id);


--
-- Name: pro2colors fkpab8koqccjmgd43dfjpil7sme; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pro2colors
    ADD CONSTRAINT fkpab8koqccjmgd43dfjpil7sme FOREIGN KEY (pro2color_product_id) REFERENCES public.products(product_id);


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               