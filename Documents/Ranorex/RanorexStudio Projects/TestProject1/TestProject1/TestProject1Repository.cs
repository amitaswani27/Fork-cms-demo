﻿///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Drawing;
using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Repository;
using Ranorex.Core.Testing;

namespace TestProject1
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    /// The class representing the TestProject1Repository element repository.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.2")]
    [RepositoryFolder("bd0b54cb-1abf-474c-9ec9-5bc17d44d614")]
    public partial class TestProject1Repository : RepoGenBaseFolder
    {
        static TestProject1Repository instance = new TestProject1Repository();

        /// <summary>
        /// Gets the singleton class instance representing the TestProject1Repository element repository.
        /// </summary>
        [RepositoryFolder("bd0b54cb-1abf-474c-9ec9-5bc17d44d614")]
        public static TestProject1Repository Instance
        {
            get { return instance; }
        }

        /// <summary>
        /// Repository class constructor.
        /// </summary>
        public TestProject1Repository() 
            : base("TestProject1Repository", "/", null, 0, false, "bd0b54cb-1abf-474c-9ec9-5bc17d44d614", ".\\RepositoryImages\\TestProject1Repositorybd0b54cb.rximgres")
        {
        }

#region Variables

#endregion

        /// <summary>
        /// The Self item info.
        /// </summary>
        [RepositoryItemInfo("bd0b54cb-1abf-474c-9ec9-5bc17d44d614")]
        public virtual RepoItemInfo SelfInfo
        {
            get
            {
                return _selfInfo;
            }
        }
    }

    /// <summary>
    /// Inner folder classes.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.2")]
    public partial class TestProject1RepositoryFolders
    {
    }
#pragma warning restore 0436
}