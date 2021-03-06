USE [master]
GO
/****** Object:  Database [DA_CNPM]    Script Date: 11/04/2016 10:43:14 ******/
CREATE DATABASE [DA_CNPM] ON  PRIMARY 
( NAME = N'DA_CNPM', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\DA_CNPM.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'DA_CNPM_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\DA_CNPM_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [DA_CNPM] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DA_CNPM].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DA_CNPM] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [DA_CNPM] SET ANSI_NULLS OFF
GO
ALTER DATABASE [DA_CNPM] SET ANSI_PADDING OFF
GO
ALTER DATABASE [DA_CNPM] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [DA_CNPM] SET ARITHABORT OFF
GO
ALTER DATABASE [DA_CNPM] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [DA_CNPM] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [DA_CNPM] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [DA_CNPM] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [DA_CNPM] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [DA_CNPM] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [DA_CNPM] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [DA_CNPM] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [DA_CNPM] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [DA_CNPM] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [DA_CNPM] SET  DISABLE_BROKER
GO
ALTER DATABASE [DA_CNPM] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [DA_CNPM] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [DA_CNPM] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [DA_CNPM] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [DA_CNPM] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [DA_CNPM] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [DA_CNPM] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [DA_CNPM] SET  READ_WRITE
GO
ALTER DATABASE [DA_CNPM] SET RECOVERY SIMPLE
GO
ALTER DATABASE [DA_CNPM] SET  MULTI_USER
GO
ALTER DATABASE [DA_CNPM] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [DA_CNPM] SET DB_CHAINING OFF
GO
USE [DA_CNPM]
GO
/****** Object:  Table [dbo].[CheckNew]    Script Date: 11/04/2016 10:43:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CheckNew](
	[idCheck] [nvarchar](50) NOT NULL,
	[idNew] [nvarchar](50) NOT NULL,
	[status] [bit] NOT NULL,
 CONSTRAINT [PK_CheckNew] PRIMARY KEY CLUSTERED 
(
	[idCheck] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CategoryDetail]    Script Date: 11/04/2016 10:43:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CategoryDetail](
	[idCatDetail] [nvarchar](50) NOT NULL,
	[nameDetail] [nvarchar](50) NOT NULL,
	[idCategory] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CategoryDetail] PRIMARY KEY CLUSTERED 
(
	[idCatDetail] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 11/04/2016 10:43:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[idCategory] [nvarchar](50) NOT NULL,
	[nameCat] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[idCategory] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Advertisement]    Script Date: 11/04/2016 10:43:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Advertisement](
	[idAdvert] [nvarchar](50) NOT NULL,
	[nameAdvert] [nvarchar](50) NOT NULL,
	[link] [nvarchar](50) NOT NULL,
	[photo] [nvarchar](50) NOT NULL,
	[idAccount] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Advertisement] PRIMARY KEY CLUSTERED 
(
	[idAdvert] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/04/2016 10:43:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[idAccount] [nvarchar](50) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[phoneNumber] [nvarchar](50) NULL,
	[email] [nvarchar](50) NOT NULL,
	[role] [bit] NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[idAccount] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[News]    Script Date: 11/04/2016 10:43:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[News](
	[idNew] [nvarchar](50) NOT NULL,
	[idAccount] [nvarchar](50) NOT NULL,
	[title] [nvarchar](50) NOT NULL,
	[content] [nvarchar](255) NOT NULL,
	[idCategory] [nvarchar](50) NOT NULL,
	[organization] [bit] NOT NULL,
	[saleBuy] [bit] NOT NULL,
	[cost] [nvarchar](50) NOT NULL,
	[photo] [nvarchar](50) NOT NULL,
	[address] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_News] PRIMARY KEY CLUSTERED 
(
	[idNew] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[vtindadang]    Script Date: 11/04/2016 10:43:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[vtindadang] AS
SELECT dbo.News.idNew,.Account.username,dbo.News.title,dbo.News.content,dbo.News.saleBuy,dbo.News.address,dbo.News.cost, dbo.News.photo
FROM (dbo.Account INNER JOIN  dbo.News ON dbo.Account.idAccount=dbo.News.idAccount) INNER JOIN dbo.CheckNew ON dbo.News.idNew = dbo.CheckNew.idNew
WHERE dbo.CheckNew.status=1
GO
/****** Object:  View [dbo].[vtinchuadang]    Script Date: 11/04/2016 10:43:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[vtinchuadang] AS
SELECT dbo.News.idNew,.Account.username,dbo.News.title,dbo.News.content,dbo.News.saleBuy,dbo.News.address,dbo.News.cost, dbo.News.photo
FROM (dbo.Account INNER JOIN  dbo.News ON dbo.Account.idAccount=dbo.News.idAccount) INNER JOIN dbo.CheckNew ON dbo.News.idNew = dbo.CheckNew.idNew
WHERE dbo.CheckNew.status=0
GO
/****** Object:  UserDefinedFunction [dbo].[fthongtinmathang]    Script Date: 11/04/2016 10:43:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[fthongtinmathang] (@id nvarchar)
RETURNS table
AS 

   RETURN(
   select dbo.News.idNew,dbo.News.title,.Account.username,dbo.Account.phoneNumber,dbo.Account.email,dbo.News.cost,dbo.News.idCategory,dbo.News.address,dbo.News.content,dbo.News.photo from dbo.Account INNER JOIN dbo.News ON dbo.News.idAccount=dbo.Account.idAccount
   where dbo.News.idNew=@id);
GO
/****** Object:  UserDefinedFunction [dbo].[fthongtinchitiet]    Script Date: 11/04/2016 10:43:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[fthongtinchitiet] (@id nvarchar)
RETURNS table
AS 

   RETURN(
   select dbo.News.idNew,dbo.News.title,.Account.username,dbo.Account.phoneNumber,dbo.Account.email,dbo.News.cost,dbo.News.idCategory,dbo.News.address,dbo.News.content from dbo.Account INNER JOIN dbo.News ON dbo.News.idAccount=dbo.Account.idAccount
   where dbo.News.idNew=@id);
GO
