toc.dat                                                                                             0000600 0004000 0002000 00000061504 14622363007 0014450 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP       ,                |            library    16.2    16.2 O    6           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false         7           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false         8           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false         9           1262    25777    library    DATABASE     �   CREATE DATABASE library WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE library;
                postgres    false         �            1259    25779    authors    TABLE     �   CREATE TABLE public.authors (
    author_birthday date NOT NULL,
    author_id bigint NOT NULL,
    author_country character varying(255) NOT NULL,
    author_name character varying(255) NOT NULL
);
    DROP TABLE public.authors;
       public         heap    postgres    false         �            1259    25778    authors_author_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.authors_author_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.authors_author_id_seq;
       public          postgres    false    216         :           0    0    authors_author_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.authors_author_id_seq OWNED BY public.authors.author_id;
          public          postgres    false    215         �            1259    25789    book2category    TABLE     �   CREATE TABLE public.book2category (
    book2category_book_id integer NOT NULL,
    book2category_category_id integer NOT NULL
);
 !   DROP TABLE public.book2category;
       public         heap    postgres    false         �            1259    25787 '   book2category_book2category_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book2category_book2category_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 >   DROP SEQUENCE public.book2category_book2category_book_id_seq;
       public          postgres    false    219         ;           0    0 '   book2category_book2category_book_id_seq    SEQUENCE OWNED BY     s   ALTER SEQUENCE public.book2category_book2category_book_id_seq OWNED BY public.book2category.book2category_book_id;
          public          postgres    false    217         �            1259    25788 +   book2category_book2category_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book2category_book2category_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 B   DROP SEQUENCE public.book2category_book2category_category_id_seq;
       public          postgres    false    219         <           0    0 +   book2category_book2category_category_id_seq    SEQUENCE OWNED BY     {   ALTER SEQUENCE public.book2category_book2category_category_id_seq OWNED BY public.book2category.book2category_category_id;
          public          postgres    false    218         �            1259    25796    book_borrowings    TABLE       CREATE TABLE public.book_borrowings (
    book_borrowing_date date NOT NULL,
    book_borrowing_return_date date NOT NULL,
    book_borrowing_id bigint NOT NULL,
    borrow_book_id integer NOT NULL,
    book_borrowing_borrower_name character varying(255) NOT NULL
);
 #   DROP TABLE public.book_borrowings;
       public         heap    postgres    false         �            1259    25794 %   book_borrowings_book_borrowing_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book_borrowings_book_borrowing_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 <   DROP SEQUENCE public.book_borrowings_book_borrowing_id_seq;
       public          postgres    false    222         =           0    0 %   book_borrowings_book_borrowing_id_seq    SEQUENCE OWNED BY     o   ALTER SEQUENCE public.book_borrowings_book_borrowing_id_seq OWNED BY public.book_borrowings.book_borrowing_id;
          public          postgres    false    220         �            1259    25795 "   book_borrowings_borrow_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book_borrowings_borrow_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 9   DROP SEQUENCE public.book_borrowings_borrow_book_id_seq;
       public          postgres    false    222         >           0    0 "   book_borrowings_borrow_book_id_seq    SEQUENCE OWNED BY     i   ALTER SEQUENCE public.book_borrowings_borrow_book_id_seq OWNED BY public.book_borrowings.borrow_book_id;
          public          postgres    false    221         �            1259    25806    books    TABLE       CREATE TABLE public.books (
    book_publication_year integer NOT NULL,
    book_stock integer NOT NULL,
    book_author_id integer NOT NULL,
    book_id bigint NOT NULL,
    book_publisher_id integer NOT NULL,
    book_name character varying(255) NOT NULL
);
    DROP TABLE public.books;
       public         heap    postgres    false         �            1259    25803    books_book_author_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.books_book_author_id_seq;
       public          postgres    false    226         ?           0    0    books_book_author_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.books_book_author_id_seq OWNED BY public.books.book_author_id;
          public          postgres    false    223         �            1259    25816    books_book_borrowings    TABLE     �   CREATE TABLE public.books_book_borrowings (
    book_book_id integer NOT NULL,
    bookborrowinglist_book_borrowing_id integer NOT NULL
);
 )   DROP TABLE public.books_book_borrowings;
       public         heap    postgres    false         �            1259    25814 &   books_book_borrowings_book_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_borrowings_book_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 =   DROP SEQUENCE public.books_book_borrowings_book_book_id_seq;
       public          postgres    false    229         @           0    0 &   books_book_borrowings_book_book_id_seq    SEQUENCE OWNED BY     q   ALTER SEQUENCE public.books_book_borrowings_book_book_id_seq OWNED BY public.books_book_borrowings.book_book_id;
          public          postgres    false    227         �            1259    25815 =   books_book_borrowings_bookborrowinglist_book_borrowing_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 T   DROP SEQUENCE public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq;
       public          postgres    false    229         A           0    0 =   books_book_borrowings_bookborrowinglist_book_borrowing_id_seq    SEQUENCE OWNED BY     �   ALTER SEQUENCE public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq OWNED BY public.books_book_borrowings.bookborrowinglist_book_borrowing_id;
          public          postgres    false    228         �            1259    25804    books_book_id_seq    SEQUENCE     z   CREATE SEQUENCE public.books_book_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.books_book_id_seq;
       public          postgres    false    226         B           0    0    books_book_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.books_book_id_seq OWNED BY public.books.book_id;
          public          postgres    false    224         �            1259    25805    books_book_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.books_book_publisher_id_seq;
       public          postgres    false    226         C           0    0    books_book_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.books_book_publisher_id_seq OWNED BY public.books.book_publisher_id;
          public          postgres    false    225         �            1259    25824 
   categories    TABLE     �   CREATE TABLE public.categories (
    category_id bigint NOT NULL,
    category_description character varying(255),
    category_name character varying(255) NOT NULL
);
    DROP TABLE public.categories;
       public         heap    postgres    false         �            1259    25823    categories_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.categories_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categories_category_id_seq;
       public          postgres    false    231         D           0    0    categories_category_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;
          public          postgres    false    230         �            1259    25833 
   publishers    TABLE     �   CREATE TABLE public.publishers (
    publisher_establish_year integer NOT NULL,
    publisher_id bigint NOT NULL,
    publisher_address character varying(255) NOT NULL,
    publisher_name character varying(255) NOT NULL
);
    DROP TABLE public.publishers;
       public         heap    postgres    false         �            1259    25832    publishers_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.publishers_publisher_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.publishers_publisher_id_seq;
       public          postgres    false    233         E           0    0    publishers_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.publishers_publisher_id_seq OWNED BY public.publishers.publisher_id;
          public          postgres    false    232         s           2604    25782    authors author_id    DEFAULT     v   ALTER TABLE ONLY public.authors ALTER COLUMN author_id SET DEFAULT nextval('public.authors_author_id_seq'::regclass);
 @   ALTER TABLE public.authors ALTER COLUMN author_id DROP DEFAULT;
       public          postgres    false    215    216    216         t           2604    25792 #   book2category book2category_book_id    DEFAULT     �   ALTER TABLE ONLY public.book2category ALTER COLUMN book2category_book_id SET DEFAULT nextval('public.book2category_book2category_book_id_seq'::regclass);
 R   ALTER TABLE public.book2category ALTER COLUMN book2category_book_id DROP DEFAULT;
       public          postgres    false    219    217    219         u           2604    25793 '   book2category book2category_category_id    DEFAULT     �   ALTER TABLE ONLY public.book2category ALTER COLUMN book2category_category_id SET DEFAULT nextval('public.book2category_book2category_category_id_seq'::regclass);
 V   ALTER TABLE public.book2category ALTER COLUMN book2category_category_id DROP DEFAULT;
       public          postgres    false    219    218    219         v           2604    25799 !   book_borrowings book_borrowing_id    DEFAULT     �   ALTER TABLE ONLY public.book_borrowings ALTER COLUMN book_borrowing_id SET DEFAULT nextval('public.book_borrowings_book_borrowing_id_seq'::regclass);
 P   ALTER TABLE public.book_borrowings ALTER COLUMN book_borrowing_id DROP DEFAULT;
       public          postgres    false    220    222    222         w           2604    25800    book_borrowings borrow_book_id    DEFAULT     �   ALTER TABLE ONLY public.book_borrowings ALTER COLUMN borrow_book_id SET DEFAULT nextval('public.book_borrowings_borrow_book_id_seq'::regclass);
 M   ALTER TABLE public.book_borrowings ALTER COLUMN borrow_book_id DROP DEFAULT;
       public          postgres    false    222    221    222         x           2604    25809    books book_author_id    DEFAULT     |   ALTER TABLE ONLY public.books ALTER COLUMN book_author_id SET DEFAULT nextval('public.books_book_author_id_seq'::regclass);
 C   ALTER TABLE public.books ALTER COLUMN book_author_id DROP DEFAULT;
       public          postgres    false    223    226    226         y           2604    25810    books book_id    DEFAULT     n   ALTER TABLE ONLY public.books ALTER COLUMN book_id SET DEFAULT nextval('public.books_book_id_seq'::regclass);
 <   ALTER TABLE public.books ALTER COLUMN book_id DROP DEFAULT;
       public          postgres    false    226    224    226         z           2604    25811    books book_publisher_id    DEFAULT     �   ALTER TABLE ONLY public.books ALTER COLUMN book_publisher_id SET DEFAULT nextval('public.books_book_publisher_id_seq'::regclass);
 F   ALTER TABLE public.books ALTER COLUMN book_publisher_id DROP DEFAULT;
       public          postgres    false    225    226    226         {           2604    25819 "   books_book_borrowings book_book_id    DEFAULT     �   ALTER TABLE ONLY public.books_book_borrowings ALTER COLUMN book_book_id SET DEFAULT nextval('public.books_book_borrowings_book_book_id_seq'::regclass);
 Q   ALTER TABLE public.books_book_borrowings ALTER COLUMN book_book_id DROP DEFAULT;
       public          postgres    false    227    229    229         |           2604    25820 9   books_book_borrowings bookborrowinglist_book_borrowing_id    DEFAULT     �   ALTER TABLE ONLY public.books_book_borrowings ALTER COLUMN bookborrowinglist_book_borrowing_id SET DEFAULT nextval('public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq'::regclass);
 h   ALTER TABLE public.books_book_borrowings ALTER COLUMN bookborrowinglist_book_borrowing_id DROP DEFAULT;
       public          postgres    false    228    229    229         }           2604    25827    categories category_id    DEFAULT     �   ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);
 E   ALTER TABLE public.categories ALTER COLUMN category_id DROP DEFAULT;
       public          postgres    false    231    230    231         ~           2604    25836    publishers publisher_id    DEFAULT     �   ALTER TABLE ONLY public.publishers ALTER COLUMN publisher_id SET DEFAULT nextval('public.publishers_publisher_id_seq'::regclass);
 F   ALTER TABLE public.publishers ALTER COLUMN publisher_id DROP DEFAULT;
       public          postgres    false    233    232    233         "          0    25779    authors 
   TABLE DATA           Z   COPY public.authors (author_birthday, author_id, author_country, author_name) FROM stdin;
    public          postgres    false    216       4898.dat %          0    25789    book2category 
   TABLE DATA           Y   COPY public.book2category (book2category_book_id, book2category_category_id) FROM stdin;
    public          postgres    false    219       4901.dat (          0    25796    book_borrowings 
   TABLE DATA           �   COPY public.book_borrowings (book_borrowing_date, book_borrowing_return_date, book_borrowing_id, borrow_book_id, book_borrowing_borrower_name) FROM stdin;
    public          postgres    false    222       4904.dat ,          0    25806    books 
   TABLE DATA           y   COPY public.books (book_publication_year, book_stock, book_author_id, book_id, book_publisher_id, book_name) FROM stdin;
    public          postgres    false    226       4908.dat /          0    25816    books_book_borrowings 
   TABLE DATA           b   COPY public.books_book_borrowings (book_book_id, bookborrowinglist_book_borrowing_id) FROM stdin;
    public          postgres    false    229       4911.dat 1          0    25824 
   categories 
   TABLE DATA           V   COPY public.categories (category_id, category_description, category_name) FROM stdin;
    public          postgres    false    231       4913.dat 3          0    25833 
   publishers 
   TABLE DATA           o   COPY public.publishers (publisher_establish_year, publisher_id, publisher_address, publisher_name) FROM stdin;
    public          postgres    false    233       4915.dat F           0    0    authors_author_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.authors_author_id_seq', 1, false);
          public          postgres    false    215         G           0    0 '   book2category_book2category_book_id_seq    SEQUENCE SET     V   SELECT pg_catalog.setval('public.book2category_book2category_book_id_seq', 1, false);
          public          postgres    false    217         H           0    0 +   book2category_book2category_category_id_seq    SEQUENCE SET     Z   SELECT pg_catalog.setval('public.book2category_book2category_category_id_seq', 1, false);
          public          postgres    false    218         I           0    0 %   book_borrowings_book_borrowing_id_seq    SEQUENCE SET     T   SELECT pg_catalog.setval('public.book_borrowings_book_borrowing_id_seq', 1, false);
          public          postgres    false    220         J           0    0 "   book_borrowings_borrow_book_id_seq    SEQUENCE SET     Q   SELECT pg_catalog.setval('public.book_borrowings_borrow_book_id_seq', 1, false);
          public          postgres    false    221         K           0    0    books_book_author_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.books_book_author_id_seq', 1, false);
          public          postgres    false    223         L           0    0 &   books_book_borrowings_book_book_id_seq    SEQUENCE SET     U   SELECT pg_catalog.setval('public.books_book_borrowings_book_book_id_seq', 1, false);
          public          postgres    false    227         M           0    0 =   books_book_borrowings_bookborrowinglist_book_borrowing_id_seq    SEQUENCE SET     l   SELECT pg_catalog.setval('public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq', 1, false);
          public          postgres    false    228         N           0    0    books_book_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.books_book_id_seq', 1, false);
          public          postgres    false    224         O           0    0    books_book_publisher_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.books_book_publisher_id_seq', 1, false);
          public          postgres    false    225         P           0    0    categories_category_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.categories_category_id_seq', 1, false);
          public          postgres    false    230         Q           0    0    publishers_publisher_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.publishers_publisher_id_seq', 1, false);
          public          postgres    false    232         �           2606    25786    authors authors_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (author_id);
 >   ALTER TABLE ONLY public.authors DROP CONSTRAINT authors_pkey;
       public            postgres    false    216         �           2606    25802 $   book_borrowings book_borrowings_pkey 
   CONSTRAINT     q   ALTER TABLE ONLY public.book_borrowings
    ADD CONSTRAINT book_borrowings_pkey PRIMARY KEY (book_borrowing_id);
 N   ALTER TABLE ONLY public.book_borrowings DROP CONSTRAINT book_borrowings_pkey;
       public            postgres    false    222         �           2606    25822 S   books_book_borrowings books_book_borrowings_bookborrowinglist_book_borrowing_id_key 
   CONSTRAINT     �   ALTER TABLE ONLY public.books_book_borrowings
    ADD CONSTRAINT books_book_borrowings_bookborrowinglist_book_borrowing_id_key UNIQUE (bookborrowinglist_book_borrowing_id);
 }   ALTER TABLE ONLY public.books_book_borrowings DROP CONSTRAINT books_book_borrowings_bookborrowinglist_book_borrowing_id_key;
       public            postgres    false    229         �           2606    25813    books books_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (book_id);
 :   ALTER TABLE ONLY public.books DROP CONSTRAINT books_pkey;
       public            postgres    false    226         �           2606    25831    categories categories_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    231         �           2606    25840    publishers publishers_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.publishers
    ADD CONSTRAINT publishers_pkey PRIMARY KEY (publisher_id);
 D   ALTER TABLE ONLY public.publishers DROP CONSTRAINT publishers_pkey;
       public            postgres    false    233         �           2606    25866 1   books_book_borrowings fk3ers8g7rpkok7freqd31s2s1w    FK CONSTRAINT     �   ALTER TABLE ONLY public.books_book_borrowings
    ADD CONSTRAINT fk3ers8g7rpkok7freqd31s2s1w FOREIGN KEY (bookborrowinglist_book_borrowing_id) REFERENCES public.book_borrowings(book_borrowing_id);
 [   ALTER TABLE ONLY public.books_book_borrowings DROP CONSTRAINT fk3ers8g7rpkok7freqd31s2s1w;
       public          postgres    false    4738    222    229         �           2606    25856 !   books fk44cp76hd0fv4lg6cbdruskfvn    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn FOREIGN KEY (book_author_id) REFERENCES public.authors(author_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn;
       public          postgres    false    4736    226    216         �           2606    25861 !   books fk53bw245gmvw9eamjbtwgrxuj3    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3 FOREIGN KEY (book_publisher_id) REFERENCES public.publishers(publisher_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3;
       public          postgres    false    233    226    4746         �           2606    25871 1   books_book_borrowings fkamabe2yflnyj9tyoc1w3uph9a    FK CONSTRAINT     �   ALTER TABLE ONLY public.books_book_borrowings
    ADD CONSTRAINT fkamabe2yflnyj9tyoc1w3uph9a FOREIGN KEY (book_book_id) REFERENCES public.books(book_id);
 [   ALTER TABLE ONLY public.books_book_borrowings DROP CONSTRAINT fkamabe2yflnyj9tyoc1w3uph9a;
       public          postgres    false    4740    226    229         �           2606    25841 )   book2category fkly8kulni41wm6m82meprhdj2x    FK CONSTRAINT     �   ALTER TABLE ONLY public.book2category
    ADD CONSTRAINT fkly8kulni41wm6m82meprhdj2x FOREIGN KEY (book2category_category_id) REFERENCES public.categories(category_id);
 S   ALTER TABLE ONLY public.book2category DROP CONSTRAINT fkly8kulni41wm6m82meprhdj2x;
       public          postgres    false    219    4744    231         �           2606    25851 +   book_borrowings fkoigmfa1w8fpmsvvcq8rp998ud    FK CONSTRAINT     �   ALTER TABLE ONLY public.book_borrowings
    ADD CONSTRAINT fkoigmfa1w8fpmsvvcq8rp998ud FOREIGN KEY (borrow_book_id) REFERENCES public.books(book_id);
 U   ALTER TABLE ONLY public.book_borrowings DROP CONSTRAINT fkoigmfa1w8fpmsvvcq8rp998ud;
       public          postgres    false    4740    222    226         �           2606    25846 )   book2category fkt1n6u8oc78wvo1myix5oonf19    FK CONSTRAINT     �   ALTER TABLE ONLY public.book2category
    ADD CONSTRAINT fkt1n6u8oc78wvo1myix5oonf19 FOREIGN KEY (book2category_book_id) REFERENCES public.books(book_id);
 S   ALTER TABLE ONLY public.book2category DROP CONSTRAINT fkt1n6u8oc78wvo1myix5oonf19;
       public          postgres    false    219    4740    226                                                                                                                                                                                                    4898.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014264 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4901.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014245 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4904.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014250 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4908.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014254 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4911.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014246 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4913.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014250 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4915.dat                                                                                            0000600 0004000 0002000 00000000005 14622363007 0014252 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        \.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           restore.sql                                                                                         0000600 0004000 0002000 00000050127 14622363007 0015374 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
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

DROP DATABASE library;
--
-- Name: library; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE library WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';


ALTER DATABASE library OWNER TO postgres;

\connect library

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
-- Name: authors; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.authors (
    author_birthday date NOT NULL,
    author_id bigint NOT NULL,
    author_country character varying(255) NOT NULL,
    author_name character varying(255) NOT NULL
);


ALTER TABLE public.authors OWNER TO postgres;

--
-- Name: authors_author_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.authors_author_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.authors_author_id_seq OWNER TO postgres;

--
-- Name: authors_author_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.authors_author_id_seq OWNED BY public.authors.author_id;


--
-- Name: book2category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book2category (
    book2category_book_id integer NOT NULL,
    book2category_category_id integer NOT NULL
);


ALTER TABLE public.book2category OWNER TO postgres;

--
-- Name: book2category_book2category_book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book2category_book2category_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.book2category_book2category_book_id_seq OWNER TO postgres;

--
-- Name: book2category_book2category_book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book2category_book2category_book_id_seq OWNED BY public.book2category.book2category_book_id;


--
-- Name: book2category_book2category_category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book2category_book2category_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.book2category_book2category_category_id_seq OWNER TO postgres;

--
-- Name: book2category_book2category_category_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book2category_book2category_category_id_seq OWNED BY public.book2category.book2category_category_id;


--
-- Name: book_borrowings; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book_borrowings (
    book_borrowing_date date NOT NULL,
    book_borrowing_return_date date NOT NULL,
    book_borrowing_id bigint NOT NULL,
    borrow_book_id integer NOT NULL,
    book_borrowing_borrower_name character varying(255) NOT NULL
);


ALTER TABLE public.book_borrowings OWNER TO postgres;

--
-- Name: book_borrowings_book_borrowing_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book_borrowings_book_borrowing_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.book_borrowings_book_borrowing_id_seq OWNER TO postgres;

--
-- Name: book_borrowings_book_borrowing_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book_borrowings_book_borrowing_id_seq OWNED BY public.book_borrowings.book_borrowing_id;


--
-- Name: book_borrowings_borrow_book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book_borrowings_borrow_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.book_borrowings_borrow_book_id_seq OWNER TO postgres;

--
-- Name: book_borrowings_borrow_book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book_borrowings_borrow_book_id_seq OWNED BY public.book_borrowings.borrow_book_id;


--
-- Name: books; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.books (
    book_publication_year integer NOT NULL,
    book_stock integer NOT NULL,
    book_author_id integer NOT NULL,
    book_id bigint NOT NULL,
    book_publisher_id integer NOT NULL,
    book_name character varying(255) NOT NULL
);


ALTER TABLE public.books OWNER TO postgres;

--
-- Name: books_book_author_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.books_book_author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.books_book_author_id_seq OWNER TO postgres;

--
-- Name: books_book_author_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.books_book_author_id_seq OWNED BY public.books.book_author_id;


--
-- Name: books_book_borrowings; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.books_book_borrowings (
    book_book_id integer NOT NULL,
    bookborrowinglist_book_borrowing_id integer NOT NULL
);


ALTER TABLE public.books_book_borrowings OWNER TO postgres;

--
-- Name: books_book_borrowings_book_book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.books_book_borrowings_book_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.books_book_borrowings_book_book_id_seq OWNER TO postgres;

--
-- Name: books_book_borrowings_book_book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.books_book_borrowings_book_book_id_seq OWNED BY public.books_book_borrowings.book_book_id;


--
-- Name: books_book_borrowings_bookborrowinglist_book_borrowing_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq OWNER TO postgres;

--
-- Name: books_book_borrowings_bookborrowinglist_book_borrowing_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq OWNED BY public.books_book_borrowings.bookborrowinglist_book_borrowing_id;


--
-- Name: books_book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.books_book_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.books_book_id_seq OWNER TO postgres;

--
-- Name: books_book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.books_book_id_seq OWNED BY public.books.book_id;


--
-- Name: books_book_publisher_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.books_book_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.books_book_publisher_id_seq OWNER TO postgres;

--
-- Name: books_book_publisher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.books_book_publisher_id_seq OWNED BY public.books.book_publisher_id;


--
-- Name: categories; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categories (
    category_id bigint NOT NULL,
    category_description character varying(255),
    category_name character varying(255) NOT NULL
);


ALTER TABLE public.categories OWNER TO postgres;

--
-- Name: categories_category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.categories_category_id_seq
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
-- Name: publishers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.publishers (
    publisher_establish_year integer NOT NULL,
    publisher_id bigint NOT NULL,
    publisher_address character varying(255) NOT NULL,
    publisher_name character varying(255) NOT NULL
);


ALTER TABLE public.publishers OWNER TO postgres;

--
-- Name: publishers_publisher_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.publishers_publisher_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.publishers_publisher_id_seq OWNER TO postgres;

--
-- Name: publishers_publisher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.publishers_publisher_id_seq OWNED BY public.publishers.publisher_id;


--
-- Name: authors author_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.authors ALTER COLUMN author_id SET DEFAULT nextval('public.authors_author_id_seq'::regclass);


--
-- Name: book2category book2category_book_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book2category ALTER COLUMN book2category_book_id SET DEFAULT nextval('public.book2category_book2category_book_id_seq'::regclass);


--
-- Name: book2category book2category_category_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book2category ALTER COLUMN book2category_category_id SET DEFAULT nextval('public.book2category_book2category_category_id_seq'::regclass);


--
-- Name: book_borrowings book_borrowing_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book_borrowings ALTER COLUMN book_borrowing_id SET DEFAULT nextval('public.book_borrowings_book_borrowing_id_seq'::regclass);


--
-- Name: book_borrowings borrow_book_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book_borrowings ALTER COLUMN borrow_book_id SET DEFAULT nextval('public.book_borrowings_borrow_book_id_seq'::regclass);


--
-- Name: books book_author_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books ALTER COLUMN book_author_id SET DEFAULT nextval('public.books_book_author_id_seq'::regclass);


--
-- Name: books book_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books ALTER COLUMN book_id SET DEFAULT nextval('public.books_book_id_seq'::regclass);


--
-- Name: books book_publisher_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books ALTER COLUMN book_publisher_id SET DEFAULT nextval('public.books_book_publisher_id_seq'::regclass);


--
-- Name: books_book_borrowings book_book_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books_book_borrowings ALTER COLUMN book_book_id SET DEFAULT nextval('public.books_book_borrowings_book_book_id_seq'::regclass);


--
-- Name: books_book_borrowings bookborrowinglist_book_borrowing_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books_book_borrowings ALTER COLUMN bookborrowinglist_book_borrowing_id SET DEFAULT nextval('public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq'::regclass);


--
-- Name: categories category_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);


--
-- Name: publishers publisher_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publishers ALTER COLUMN publisher_id SET DEFAULT nextval('public.publishers_publisher_id_seq'::regclass);


--
-- Data for Name: authors; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.authors (author_birthday, author_id, author_country, author_name) FROM stdin;
\.
COPY public.authors (author_birthday, author_id, author_country, author_name) FROM '$$PATH$$/4898.dat';

--
-- Data for Name: book2category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.book2category (book2category_book_id, book2category_category_id) FROM stdin;
\.
COPY public.book2category (book2category_book_id, book2category_category_id) FROM '$$PATH$$/4901.dat';

--
-- Data for Name: book_borrowings; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.book_borrowings (book_borrowing_date, book_borrowing_return_date, book_borrowing_id, borrow_book_id, book_borrowing_borrower_name) FROM stdin;
\.
COPY public.book_borrowings (book_borrowing_date, book_borrowing_return_date, book_borrowing_id, borrow_book_id, book_borrowing_borrower_name) FROM '$$PATH$$/4904.dat';

--
-- Data for Name: books; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.books (book_publication_year, book_stock, book_author_id, book_id, book_publisher_id, book_name) FROM stdin;
\.
COPY public.books (book_publication_year, book_stock, book_author_id, book_id, book_publisher_id, book_name) FROM '$$PATH$$/4908.dat';

--
-- Data for Name: books_book_borrowings; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.books_book_borrowings (book_book_id, bookborrowinglist_book_borrowing_id) FROM stdin;
\.
COPY public.books_book_borrowings (book_book_id, bookborrowinglist_book_borrowing_id) FROM '$$PATH$$/4911.dat';

--
-- Data for Name: categories; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.categories (category_id, category_description, category_name) FROM stdin;
\.
COPY public.categories (category_id, category_description, category_name) FROM '$$PATH$$/4913.dat';

--
-- Data for Name: publishers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.publishers (publisher_establish_year, publisher_id, publisher_address, publisher_name) FROM stdin;
\.
COPY public.publishers (publisher_establish_year, publisher_id, publisher_address, publisher_name) FROM '$$PATH$$/4915.dat';

--
-- Name: authors_author_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.authors_author_id_seq', 1, false);


--
-- Name: book2category_book2category_book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book2category_book2category_book_id_seq', 1, false);


--
-- Name: book2category_book2category_category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book2category_book2category_category_id_seq', 1, false);


--
-- Name: book_borrowings_book_borrowing_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book_borrowings_book_borrowing_id_seq', 1, false);


--
-- Name: book_borrowings_borrow_book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book_borrowings_borrow_book_id_seq', 1, false);


--
-- Name: books_book_author_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.books_book_author_id_seq', 1, false);


--
-- Name: books_book_borrowings_book_book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.books_book_borrowings_book_book_id_seq', 1, false);


--
-- Name: books_book_borrowings_bookborrowinglist_book_borrowing_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.books_book_borrowings_bookborrowinglist_book_borrowing_id_seq', 1, false);


--
-- Name: books_book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.books_book_id_seq', 1, false);


--
-- Name: books_book_publisher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.books_book_publisher_id_seq', 1, false);


--
-- Name: categories_category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.categories_category_id_seq', 1, false);


--
-- Name: publishers_publisher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.publishers_publisher_id_seq', 1, false);


--
-- Name: authors authors_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (author_id);


--
-- Name: book_borrowings book_borrowings_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book_borrowings
    ADD CONSTRAINT book_borrowings_pkey PRIMARY KEY (book_borrowing_id);


--
-- Name: books_book_borrowings books_book_borrowings_bookborrowinglist_book_borrowing_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books_book_borrowings
    ADD CONSTRAINT books_book_borrowings_bookborrowinglist_book_borrowing_id_key UNIQUE (bookborrowinglist_book_borrowing_id);


--
-- Name: books books_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (book_id);


--
-- Name: categories categories_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);


--
-- Name: publishers publishers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publishers
    ADD CONSTRAINT publishers_pkey PRIMARY KEY (publisher_id);


--
-- Name: books_book_borrowings fk3ers8g7rpkok7freqd31s2s1w; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books_book_borrowings
    ADD CONSTRAINT fk3ers8g7rpkok7freqd31s2s1w FOREIGN KEY (bookborrowinglist_book_borrowing_id) REFERENCES public.book_borrowings(book_borrowing_id);


--
-- Name: books fk44cp76hd0fv4lg6cbdruskfvn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn FOREIGN KEY (book_author_id) REFERENCES public.authors(author_id);


--
-- Name: books fk53bw245gmvw9eamjbtwgrxuj3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3 FOREIGN KEY (book_publisher_id) REFERENCES public.publishers(publisher_id);


--
-- Name: books_book_borrowings fkamabe2yflnyj9tyoc1w3uph9a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books_book_borrowings
    ADD CONSTRAINT fkamabe2yflnyj9tyoc1w3uph9a FOREIGN KEY (book_book_id) REFERENCES public.books(book_id);


--
-- Name: book2category fkly8kulni41wm6m82meprhdj2x; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book2category
    ADD CONSTRAINT fkly8kulni41wm6m82meprhdj2x FOREIGN KEY (book2category_category_id) REFERENCES public.categories(category_id);


--
-- Name: book_borrowings fkoigmfa1w8fpmsvvcq8rp998ud; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book_borrowings
    ADD CONSTRAINT fkoigmfa1w8fpmsvvcq8rp998ud FOREIGN KEY (borrow_book_id) REFERENCES public.books(book_id);


--
-- Name: book2category fkt1n6u8oc78wvo1myix5oonf19; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book2category
    ADD CONSTRAINT fkt1n6u8oc78wvo1myix5oonf19 FOREIGN KEY (book2category_book_id) REFERENCES public.books(book_id);


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         