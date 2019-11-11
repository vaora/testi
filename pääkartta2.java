<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8' />
    <title></title>
    <meta name='viewport' content='initial-scale=1,maximum-scale=1,user-scalable=no' />
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <script src='https://api.tiles.mapbox.com/mapbox-gl-js/v1.4.0/mapbox-gl.js'></script>
    <link href='https://api.tiles.mapbox.com/mapbox-gl-js/v1.4.0/mapbox-gl.css' rel='stylesheet' />
    <style>
      body {
        margin: 0;
        padding: 0;
      }

      #map {
        position: absolute;
        top: 0;
        bottom: 0;
        width: 100%;
      }
	  .marker {
  background-image: url('mapbox-icon');
  background-size: cover;
  width: 50px;
  height: 50px;
  border-radius: 50%;
  cursor: pointer;
}
.mapboxgl-popup {
  max-width: 200px;
}

.mapboxgl-popup-content {
  text-align: center;
  font-family: 'Open Sans', sans-serif;
}

    </style>
</head>
<body>

<div id='map'></div>

<script>

mapboxgl.accessToken = 'pk.eyJ1IjoiZXZhbnVyYSIsImEiOiJjazE3amtzOGoxZDRkM21weW9zN3d1bWdyIn0.LpwvQ-ITmH9mr3dRtUKN9Q';

var map = new mapboxgl.Map({
  container: 'map',
  style: 'mapbox://styles/evanura/ck2ndwa6v172v1cnpmu8w3gi6',
  center: [-10, -5],
  zoom: 5.5
});

var geojson = {
  type: 'FeatureCollection',
  features: [{
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-12.22041393, -4.54747628]
    },
    properties: {
      title: 'Val Royeaux',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-7.14181343, -5.44672224]
    },
    properties: {
      title: 'Haven/Skyhold',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-9.15640761, -6.58792711]
    },
    properties: {
      title: 'Emprise du Lion',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-4.11798421, -4.45853182]
    },
    properties: {
      title: 'Crestwood',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-3.66801405, -3.27502770]
    },
    properties: {
      title: 'The Storm Coast',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-1.73490325, -4.95659682]
    },
    properties: {
      title: 'Castle of Caer Oswin',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-5.30951948, -7.73885924]
    },
    properties: {
      title: 'Redcliffe Village',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-3.98878510, -7.81804736]
    },
    properties: {
      title: 'The Hinterlands',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-10.11369485, -8.53594903]
    },
    properties: {
      title: 'The Emerald Graves',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-11.75476727, -7.04014381]
    },
    properties: {
      title: 'Exalted Plains',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-9.69611454, -9.32288242]
    },
    properties: {
      title: 'The Cradle of Sulevin',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-12.65909152, -8.01195737]
    },
    properties: {
      title: 'Altar of Mythal',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-12.19544928, -9.42588445]
    },
    properties: {
      title: 'Arbor Wilds',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-17.56383930, -6.59448842]
    },
    properties: {
      title: 'The Western Approach',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-18.54788054, -6.25962207]
    },
    properties: {
      title: 'Forbidden Oasis',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-17.31054855, -5.27716298]
    },
    properties: {
      title: 'Hissing Wastes',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-11.75003238, -1.15082319]
    },
    properties: {
      title: 'Shrine of Dumat',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-16.89101162, -6.09559120]
    },
    properties: {
      title: 'Adamant Fortress',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-3.65890454, -9.29509514]
    },
    properties: {
      title: 'The Fallow Mire',
      description: '<a href="https://www.google.com/">Avaa kartta</a>'
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-7.49933980, -3.25714569]
    },
    properties: {
      title: 'Valence Cloister',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-12.23673899, -3.19767304]
    },
    properties: {
      title: 'Secluded Courtyard',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-12.22469100, -2.11428833]
    },
    properties: {
      title: 'Ghislain Estate',
      description: ''
    }
  },
  {
    type: 'Feature',
    geometry: {
      type: 'Point',
      coordinates: [-10.08564846, -3.56651438]
    },
    properties: {
      title: 'Lost Temple of Dirthamen',
      description: ''
    }
  }]
};
// add markers to map
geojson.features.forEach(function(marker) {

  // create a HTML element for each feature
  var el = document.createElement('div');
  el.className = 'marker';

  // make a marker for each feature and add to the map
  new mapboxgl.Marker(el)
  .setLngLat(marker.geometry.coordinates)
  .setPopup(new mapboxgl.Popup({ offset: 25 }) // add popups
    .setHTML('<h3>' + marker.properties.title + '</h3><p>' + marker.properties.description + '</p>'))
  .addTo(map);

});



</script>

</body>
</html>
